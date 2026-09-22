public class Class_Assesment{

    static class Book {
        int bookId;
        String title;
        String author;
        double price;

        Book(int bookId, String title, String author, double price) {
            this.bookId = bookId;
            this.title = title;
            this.author = author;
            this.price = price;
        }
    }

    // Task 1: Remove duplicate book records in-place
    public static int removeDuplicates(Book[] books, int n) {
        int unique = 0;

        for (int i = 0; i < n; i++) {
            boolean duplicate = false;

            for (int j = 0; j < unique; j++) {
                if (books[i].bookId == books[j].bookId) {
                    duplicate = true;
                    break;
                }
            }

            if (!duplicate) {
                books[unique] = books[i];
                unique++;
            }
        }
        return unique;
    }

    // Task 2: Partial title search (case-insensitive)
    public static void searchByTitle(Book[] books, int count, String query) {
        System.out.println("\nSearch Results for \"" + query + "\":");
        boolean found = false;

        for (int i = 0; i < count; i++) {
            if (books[i].title.toLowerCase().contains(query.toLowerCase())) {
                System.out.printf("Found: [%d] %s (Rs. %.1f)%n",
                        books[i].bookId, books[i].title, books[i].price);
                found = true;
            }
        }

        if (!found)
            System.out.println("No matching book found.");
    }

    // Task 3: Selection sort by price
    public static void sortByPrice(Book[] books, int count) {
        for (int i = 0; i < count - 1; i++) {
            int min = i;

            for (int j = i + 1; j < count; j++) {
                if (books[j].price < books[min].price)
                    min = j;
            }

            Book temp = books[i];
            books[i] = books[min];
            books[min] = temp;
        }
    }

    // Task 4: Binary search by exact price
    // Array must already be sorted by price.
    public static int searchByPrice(Book[] books, int count, double targetPrice) {
        int left = 0, right = count - 1;

        while (left <= right) {
            int mid = (left + right) / 2;

            if (Math.abs(books[mid].price - targetPrice) < 0.000001)
                return mid;
            else if (books[mid].price < targetPrice)
                left = mid + 1;
            else
                right = mid - 1;
        }

        return -1;
    }

    // Task 5: Minimum consecutive books whose total price >= target
    // Sliding window, O(n) time and O(1) auxiliary space.
    public static int minBooksForTargetCost(Book[] books, int count, double targetCost) {
        int left = 0;
        double sum = 0;
        int minLength = Integer.MAX_VALUE;

        for (int right = 0; right < count; right++) {
            sum += books[right].price;

            while (sum >= targetCost) {
                minLength = Math.min(minLength, right - left + 1);
                sum -= books[left].price;
                left++;
            }
        }

        return minLength == Integer.MAX_VALUE ? 0 : minLength;
    }

    static void printBooks(Book[] books, int count) {
        for (int i = 0; i < count; i++) {
            System.out.printf("[%d] %s - Rs. %.1f%n",
                    books[i].bookId, books[i].title, books[i].price);
        }
    }

    public static void main(String[] args) {
        Book[] books = {
            new Book(101, "Data Structures", "Mark", 400.0),
            new Book(101, "Data Structures", "Mark", 400.0), // duplicate
            new Book(102, "Java Basics", "James", 300.0),
            new Book(103, "Python Guide", "Guido", 600.0),
            new Book(104, "Database Systems", "Hugo", 500.0),
            new Book(105, "Computer Networks", "Andrew", 700.0)
        };

        int count = books.length;

        // Task 1
        count = removeDuplicates(books, count);
        System.out.println("Unique Books Count: " + count);
        System.out.println("Book List:");
        printBooks(books, count);

        // Task 2
        searchByTitle(books, count, "data");

        // Task 3
        sortByPrice(books, count);
        System.out.println("\nBooks Sorted by Price:");
        printBooks(books, count);

        // Task 4
        double targetPrice = 500.0;
        int index = searchByPrice(books, count, targetPrice);
        System.out.println("\nSearch for Price Rs. " + targetPrice + ":");
        if (index != -1)
            System.out.println("Book found at index " + index + ": " +
                    books[index].title);
        else
            System.out.println("Book not found.");

        // Task 5
        double targetCost = 1000.0;
        int minBooks = minBooksForTargetCost(books, count, targetCost);
        System.out.println("\nMinimum consecutive books for Rs. " + targetCost
                + ": " + minBooks);
    }
}
