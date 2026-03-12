public class Activity {
    private String name;
    private String budget;
    private String locationType;
    private String vibe;

    public Activity (String name, String budget, String locationType, String vibe) {
        this.name = name;
        this.budget = budget;
        this.locationType = locationType;
        this.vibe = vibe;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBudget() {
        return budget;
    }

    public void setBudget(String budget) {
        this.budget = budget;
    }

    public String getLocationType() {
        return locationType;
    }

    public void setLocationType(String locationType) {
        this.locationType = locationType;
    }

    public String getVibe() {
        return vibe;
    }

    public void setVibe(String vibe) {
        this.vibe = vibe;
    }    

    @Override
    public String toString() {
        return name + " [" + budget + ", " + locationType + ", " + vibe + "]";
    }

}