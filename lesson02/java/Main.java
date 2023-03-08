public class Main {
    public static void main(String[] args) {
        Club club = new Club("Benfica", 1905);

        System.out.println(club.getName());
        System.out.println(club.getFoundationDate());

        club.setFoundationDate(1904);
        
    }
}
