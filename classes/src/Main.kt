fun main() {

//    val myBook = Book()
//    myBook.title = "crime and punishment"
//    myBook.author = "Fyodor Dostoevsky"
//    myBook.yearPublished = 1866

    val myBook = Book("crime and punishment", "Fyodor Dostoevsky", 1866, "Psychological Fiction")
    println(myBook.getBookInfo())
}


//class Book {
//    var title: String = ""
//    var author: String = ""
//    var yearPublished: Int = 1990
//}

class Book (var title: String, var author: String, var yearPublished: Int, var genre: String) {
    fun getBookInfo(): String {
        return "$title by $author ($yearPublished) - Genre: $genre"
    }
}