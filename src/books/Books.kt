package books

open class Book(val title: String = "Bible", val author: String = "God") {

    private var currentPage = 1

    open fun readPage() {
        currentPage++
    }
}

class Ebook(title: String, author: String, var format: String= "text"): Book(title, author) {
    private var wordsRead = 0

    override fun readPage() {
        wordsRead = wordsRead + 250
    }
}