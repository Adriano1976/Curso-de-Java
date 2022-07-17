package Services;

import Entities.VoteCount;
import Entities.VoteCountListing;

import java.util.*;

public class CandidateSummaryReport {

    private final Map<String, Integer> summary = new HashMap<>();

    public CandidateSummaryReport() {
    }

    public void countVotes(VoteCountListing list) {
        Iterator<VoteCount> votes = list.getVotes();

        while (votes.hasNext()) {
            VoteCount voteCount = votes.next();
            int count = summary.getOrDefault(voteCount.name(), 0) + voteCount.votes();
            summary.put(voteCount.name(), count);
        }
    }

    public Iterator<VoteCount> summary() {
        return this.summary(null);
    }

    public Iterator<VoteCount> summary(Comparator<? super VoteCount> comparator) {
        Set<VoteCount> set = new TreeSet<>(comparator);

        for (Map.Entry<String, Integer> counter : summary.entrySet()) {
            set.add(new VoteCount(counter.getKey(), counter.getValue()));
        }
        return set.iterator();
    }
}
