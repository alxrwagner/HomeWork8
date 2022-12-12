public class Main {
    public static void main(String[] args) {
        Author terryPratchett = new Author("Терри", "Пратчетт");
        Author joanneRowling = new Author("Джоан", "Роулинг");

        Book harryPotterPart1 = new Book("Гарри Поттер и филосовский камень", 1996, joanneRowling);
        Book theWitchersAbroad = new Book("Ведьмы за границей", 1991, terryPratchett);

        harryPotterPart1.setYearPublication(1997);
    }
}