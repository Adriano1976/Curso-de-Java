package Application;

import Entities.VoteCount;
import Services.CandidateSummaryReport;
import Services.VotingCSVReader;

import java.io.IOException;
import java.util.Iterator;
import java.util.Scanner;

public class Program {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        try (scanner) {
            System.out.println();
            System.out.print("Enter file full path: ");
            String filePath = scanner.nextLine();

            VotingCSVReader csvReader = new VotingCSVReader(filePath);
            csvReader.readFile();

            CandidateSummaryReport report = new CandidateSummaryReport();
            report.countVotes(csvReader);

            Iterator<VoteCount> summary = report.summary(((vc1, vc2) -> vc2.votes().compareTo(vc1.votes())));

            int index = 0;
            System.out.println();
            System.out.println("The Candidate Summary Report");
            while (summary.hasNext()) {
                System.out.printf("%dº - %s\n", ++index, summary.next());
            }
        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
            e.printStackTrace();
        }
    }
}
