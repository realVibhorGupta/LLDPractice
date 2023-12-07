package dataReplication.singleLeader;

public class FollowerNode {
    private LeaderNode leaderNode;

    public void setLeader(LeaderNode leaderNode) {
        this.leaderNode = leaderNode;
    }

    public void receiveReplication(String key, String value) {
        // Simulate applying replicated changes
        System.out.println("Follower Node: Replicating changes - Key: " + key + ", Value: " + value);
    }
}