# Random Book REST API

This project is a simple REST API that provides random book information whenever user requests or reload the web browser. The API has two endpoints: one for retrieving a single random book and another for retrieving a list of random books of a specified size.

## Endpoints

#### Get A Random Book

```http
  GET /api/books
```
Response body
```json
{
  "title": "The Last Enemy",
  "author": "Vernia Wolf",
  "genre": "Metafiction",
  "publisher": "Charles Scribner's Sons"
}
```

#### Get Random Books
```http
  GET /api/books/15
```
Response body
```json
[
  {
    "title": "The Skull Beneath the Skin",
    "author": "Miss Curt Gottlieb",
    "genre": "Legend",
    "publisher": "Holt McDougal"
  },
  {
    "title": "The Soldier's Art",
    "author": "Wallace Hyatt",
    "genre": "Fiction in verse",
    "publisher": "Harper & Row"
  },
  {
    "title": "Have His Carcase",
    "author": "Sonya Larson III",
    "genre": "Humor",
    "publisher": "Manning Publications"
  },
  {
    "title": "An Evil Cradling",
    "author": "Ardis Nienow",
    "genre": "Fairy tale",
    "publisher": "St. Martin's Press"
  },
  {
    "title": "Cover Her Face",
    "author": "Lenora Brekke",
    "genre": "Biography/Autobiography",
    "publisher": "Macmillan Publishers"
  },
  {
    "title": "As I Lay Dying",
    "author": "Hoa Ziemann",
    "genre": "Folklore",
    "publisher": "No Starch Press"
  },
  {
    "title": "Death Be Not Proud",
    "author": "Evan Rath",
    "genre": "Fairy tale",
    "publisher": "D. Appleton & Company"
  },
  {
    "title": "The Last Temptation",
    "author": "Miss Jamaal Rempel",
    "genre": "Fantasy",
    "publisher": "Voyager Books"
  },
  {
    "title": "A Passage to India",
    "author": "Odell Johnston",
    "genre": "Mythology",
    "publisher": "Harvard University Press"
  },
  {
    "title": "Paths of Glory",
    "author": "Isidro Fahey",
    "genre": "Fable",
    "publisher": "Shoemaker & Hoard Publishers"
  },
  {
    "title": "Mother Night",
    "author": "Fausto Mayer",
    "genre": "Tall tale",
    "publisher": "Flame Tree Publishing"
  },
  {
    "title": "Clouds of Witness",
    "author": "Doyle O'Keefe",
    "genre": "Biography/Autobiography",
    "publisher": "Atlantic Books"
  },
  {
    "title": "Nectar in a Sieve",
    "author": "Joey Bogisich",
    "genre": "Mythopoeia",
    "publisher": "Voyager Books"
  },
  {
    "title": "The Wives of Bath",
    "author": "Mr. Marcelo Fritsch",
    "genre": "Suspense/Thriller",
    "publisher": "Apress"
  },
  {
    "title": "The Far-Distant Oxus",
    "author": "Bettie Cormier",
    "genre": "Fable",
    "publisher": "Paulist Press"
  }
]
```
