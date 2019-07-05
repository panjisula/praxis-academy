package contoh.micronaut

interface BooksRepository {
    List<Book> findAll()
}