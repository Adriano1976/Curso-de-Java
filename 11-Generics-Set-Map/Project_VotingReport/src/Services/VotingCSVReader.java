package Services;

import Entities.VoteCount;
import Entities.VoteCountListing;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class VotingCSVReader implements VoteCountListing {

    private final BufferedReader reader;
    private final List<VoteCount> list = new ArrayList<>();

    public VotingCSVReader(String filePath) throws FileNotFoundException {
        reader = new BufferedReader(new FileReader(filePath));
    }

    public void readFile() throws IOException {
        String line = reader.readLine();

        while (line != null) {
            String[] fields = line.split(",");
            String name = fields[0].trim();
            int votes = Integer.parseInt(fields[1].trim());
            list.add(new VoteCount(name, votes));
            line = reader.readLine();
        }
    }

    @Override
    public Iterator<VoteCount> getVotes() {
        return list.iterator();
    }
}
