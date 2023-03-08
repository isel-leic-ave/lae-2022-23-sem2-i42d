class Club {
    private String name;
    private int foundationDate;

    public Club(String name, int foundationDate) {
        this.name = name;
        this.foundationDate = foundationDate;
    }

    public String getName() {
        return name;
    }

    public int getFoundationDate() {
        return foundationDate;
    }

    public void setFoundationDate(int value) {
        if(value < 1800) 
            throw new IllegalArgumentException();
        foundationDate = value;
    }

    
}