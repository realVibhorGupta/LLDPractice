package dataReplication.singleLeader;

import java.util.HashMap;
import java.util.Map;

class KeyValueStore {
    private  Map<String, String> data = new HashMap<>();

    public String get(String key) {
        return data.get(key);
    }

    public void put(String key, String value) {
        data.put(key, value);
    }
}

class LeaderNode {
    private KeyValueStore keyValueStore;
    private FollowerNode followerNode;

    public LeaderNode() {
        this.keyValueStore = new KeyValueStore();
        this.followerNode = new FollowerNode();
        followerNode.setLeader(this);
    }

    public void replicate(String key, String value) {
        // Simulate replication to followers
        followerNode.receiveReplication(key, value);
    }

    public void put(String key, String value) {
        keyValueStore.put(key, value);
        replicate(key, value);
    }

    public String get(String key) {
        return keyValueStore.get(key);
    }
}

class FollowerNode {
    private LeaderNode leaderNode;

    public void setLeader(LeaderNode leaderNode) {
        this.leaderNode = leaderNode;
    }

    public void receiveReplication(String key, String value) {
        // Simulate applying replicated changes
        System.out.println("Follower Node: Replicating changes - Key: " + key + ", Value: " + value);
    }
}


