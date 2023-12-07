package dataReplication.singleLeader;

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
