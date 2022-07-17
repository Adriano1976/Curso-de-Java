package Entities;

import java.util.Objects;

public record VoteCount(String name, Integer votes) implements Comparable<VoteCount> {


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof VoteCount voteCount)) return false;
        return name().equals(voteCount.name()) && votes().equals(voteCount.votes());
    }

    @Override
    public int hashCode() {
        return Objects.hash(name(), votes());
    }


    @Override
    public int compareTo(VoteCount other) {
        return name().toLowerCase().compareTo(other.name().toLowerCase());
    }

    @Override
    public String toString() {
        return name + " - \t" + votes + " votes";
    }
}
