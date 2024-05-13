class Book {

    val pages:List<Page>
    var page: Page

    constructor(pages: List<Page>) {
        if (pages.isEmpty()) {
            throw IllegalArgumentException("Book needs to have atleast one page.")
        }

        this.pages = pages
        page = pages[0]
    }

    fun read() {
        page.read()
    }

    fun nextPage() {
        val pageIndex = pages.indexOf(page)
        if (pageIndex < pages.size - 1) {
            page = pages[pageIndex + 1]
        } else {
            println("Du bist bereits am Ende des Buches.")
        }
    }

    fun previousPage() {
        val pageIndex = pages.indexOf(page)
        if (pageIndex > 0) {
            page = pages[pageIndex - 1]
        } else {
            println("Du bist bereits am Anfang des Buches.")
        }
    }
}