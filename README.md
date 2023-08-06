# JavaSearchEngine
Simple Java Search Engine Using Jsoup

The purpose of this web search engine is to systematically look up URLs. The search engine begins crawling as soon as the user enters a specific URL for a search. After the crawling was complete, it began searching for the pattern that the user had entered. 

Afterwards, it identifies the specific word with the pattern using the Boyer-Moore algorithm. If a word appears in the crawled data, the number of occurrences, the source file name, and the website URL are displayed.

Additionally, it reveals the top 5 files that include the specific word that the individual searched for after sorting the data using merge sort.

## Web Crawling

- A web scraper is used to collect data from the internet.
- The data is scraped from a variety of websites, search engines, news sources, social media platforms, etc.
- A URL is given to the scraper, which loads the complete HTML page, extracts the data from it, and stores the results in a folder.

## Frequency Counter

- It keeps track of how frequently a term appears in a text file.
- The user specifies the word whose frequency needs to be counted.
- When parsing HTML files, the program searches for the required word in each text file that was saved.

## Ranking

- Sorting is done using merge sort algorithms. The web crawler will first gather the content from the website before adding it to an index of recently visited pages and organizing the data.
- Ranking is the term used to describe the relevancy-based ranking of search results.
- Search engines search their index for information that is highly relevant to a search and then arrange that information.  
- In general, the search engine considers a website to be more relevant to the query the higher it ranks
