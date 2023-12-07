package dataReplication.singleLeader;

public class SingleLeaderReplicationExample {
    public static void main(String[] args) {
        LeaderNode leaderNode = new LeaderNode();

        // Perform write operation on the leader node
        leaderNode.put("key1", "value1");

        // Perform read operation on the leader node
        String result = leaderNode.get("key1");
        System.out.println("Leader Node: Read result - Key: key1, Value: " + result);
    }
}