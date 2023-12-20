# Formatting Text Spans


she thought in *italics*

she thought in _italics_





to **boldly** go

to __boldly__ go



t

**Boldness has *genius*, _power_, and *magic*** in it



Should I use `pandas` or `dplyr`?


Every strike brings me ~closer to~ the next home run





$e^{\pi i} + 1 = 0$



# Formatting Text Blocks


> Without data you're just

> another person with an opinion



```

x = (1 + sqrt(5)) / 2

```




``` python

x = (1 + sqrt(5)) / 2

```



# Lists



- bread

- milk

- eggs

- teabags





3. three

1. four

1. five

1. six

three
four
five
six
Inside a list, include square brackets filled with a space or character (conventionally 'x') to create a checklist

- [x] bread

- [ ] milk

- [x] eggs

- [ ] teabags

 


Use space indentation to nest lists

* The Lord of the Rings

1. The Fellowship of the Ring

1. The Ring Sets Out

1. The Ring Goes South

1. The Two Towers

1. The Treason of Isengard

1. The Ring Goes East

1. The Return of the King

1. The War of the Ring

1. The End of the Third Age

The Lord of the Rings
The Fellowship of the Ring
The Ring Sets Out
The Ring Goes South
The Two Towers
The Treason of Isengard
The Ring Goes East
The Return of the King
The War of the Ring
The End of the Third Age
Headings
Start a line with one to six hashes then a space to make it a heading

# Constitution of the United States

## Articles

### Article I: The Legislative Branch

#### Section 1: The Legislature

Constitution of the United States
Articles
Article I: The Legislative Branch
Section 1: The Legislature
For level one headings, you can also follow the line with a line of equals signs

Constitution of the United States

=================================

Constitution of the United States
For level two headings, you can also follow the line with a line of hyphens

Articles

--------

Articles
Links, Images and Footnotes
Use square brackets containing link text followed by parentheses containing a URL to include a hyperlink

[Build data and AI skills with DataCamp](https://www.datacamp.com)

Build data and AI skills with DataCamp

Use square brackets containing link text followed by a reference number, then (usually at the bottom of the doc) square brackets containing the reference number followed by a colon then a space then a URL to include reference-style hyperlinks.

[Listen to DataFramed][1]

[1]: https://www.datacamp.com/podcast

Listen to DataFramed

Use an exclamation mark followed by square brackets containing alt text followed by parentheses containing a URL or path to a file to include an image

![The Markdown logo](Markdown-mark.png)

The Markdown logo

Use square brackets containing a caret then a number (both within the content and at the foot of the page) to create a footnote.

Literature is the original Internet – every footnote, every citation, every allusion is essentially a hyperlink to another text, to another mind.[^1]

[^1]: Attributed to Maria Popova



Tables
Use pipes to delimit columns in a table. Use hyphens to separate the header from the content. Use a colon to the left or right of those hyphens to indicate column alignment.

| Sepal Length| Sepal Width| Petal Length| Petal Width|      Species |

|-----------------:|----------------:|-----------------:|---------------:|:---------------|

|                 5.1|                3.3|                  1.7|              0.5|        setosa |

|                4.8|                3.0|                  1.4|              0.1|        setosa |

|                 6.1|                2.8|                 4.7|               1.2|   versicolor |

|                 6.1|                3.0|                 4.6|               1.4|  versicolor |

Sepal Length

Sepal Width

Petal Length

Petal Width

Species

5.1

3.3

1.7

0.5

setosa

4.8

3.0

1.4

0.1

setosa

6.1

2.8

4.7

1.2

versicolor

6.1

3.0

4.6

1.4

versicolor

Breaks
Have a line with only three or more hyphens, asterisks, or underscores (plus optional spaces) to include a horizontal rule.

---

***

___



By default, text on consecutive lines flows as a single line.

Writing one line,

then another without a break,

results in text flowing as a single line.

Writing one line, then another without a break, results in text flowing as a single line.

Two spaces at the end of a line result in a line break.

Appending two spaces to the end of the line¶¶

creates a line break.

Appending two spaces to the end of the line

creates a line break.

Blank lines create a new paragraph.

Including a blank line in between two lines of text

creates a paragraph break.
