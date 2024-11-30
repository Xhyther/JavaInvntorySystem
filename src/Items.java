public class Items {
    private String name;
    private String key = RandomKeyGenerator.generateRandomKey(5);
    private int frequency;

    public Items(String name, String key, int frequency) {
        this.name = name;
        this.key = key;
        this.frequency = frequency;
    }

    // Getters and Setters
    public String getName() {
        return name;
    }

    public String getKey() {
        return key;
    }

    public int getFrequency() {
        return frequency;
    }

    // Increment the frequency of the item
    public void incrementFrequency() {
        this.frequency++;
    }

    // Decrement the frequency of the item
    public void decrementFrequency() {
        if (this.frequency > 0) {
            this.frequency--;
        }
    }

}
