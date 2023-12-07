package dataReplication.singleLeader;

public class SingleLeaderReplicationExample {
    public static void main(String[] args) {
        LeaderNode leaderNode = new LeaderNode();

        // Perform write operation on the leader node
        leaderNode.put("Name", "Rahul");

        // Perform read operation on the leader node
        String result = leaderNode.get("Name");
        System.out.println("Leader Node: Read result - Key: Name, Value: " + result);
    }
}