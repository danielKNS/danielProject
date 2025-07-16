# HTML Elements, Attributes, and Comments

HTML elements describe the structure and content of a web page. Tags are used to indicate the beginning and end of elements. The syntax is as follows:

` <tagname>Element content</tagname> `

## Attributes
Tags often have attributes for further defining the element. Attributes usually come in name-value pairs.

Note that attributes only appear in the opening tag, like so:

` <tagname att1="value" att2="value">Element content</tagname> `

There are some attributes that do not need to take a value. You can think of them as being “on” when the attribute is present and “off” when it is not. For example:

` <tagname att>Element content</tagname> `  <--- CONTAINER 

The order of attributes is not important.

## Empty vs. Container Tags

The tags shown above are called container tags because they have both an opening and closing tag with content contained between them.
 Tags that do not contain content are called empty tags. The syntax is as follows:

 ` <tagname /> `

    or

` <tagname att1="value" att2="value" /> `


## Shortcut Close
Empty tags may also be written as follows:

` <tagname /> `
    or

` <tagname att1="value" att2="value" /> `

The forward slash (/) at the end, just before the close angle bracket (>), explicitly indicates that this tag is closed.
In general, it is not necessary to use this shortcut close, but it also doesn’t cause any harm. Our only recommendation is that if you use it, use it consistently.

# Block and Inline Elements

## Block-level Elements 

Block-level elements are elements that separate a block of content. For example, a paragraph (<p>) element is a block-level element. Other block-level elements include:

Lists (<ul> and <ol>)
Tables (<table>)
Forms (<form>)
Divs (<div>)

## Inline Elements
Inline elements are elements that affect only snippets of content and do not block off a section of a page. Examples of inline elements include:

- "Snippet" is a programming term for a small region of re-usable source code, machine code, or text.

Links (<a>)
Images (<img>)
Form elements (<input>, <button>, <select>, <textarea>, etc.)
Phrase elements (<em>, <strong>, <code>, etc.)
Spans (<span>) – wraps text without giving it any special meaning. Meaning and style can be applied through its attributes.

## Comments
HTML comments are enclosed in <!-- and -->.

For example:

<!-- This is an HTML comment -->

Comments are generally used for one of two purposes:

To write helpful notes about the code; for example, why something is written in a specific way.
To comment out some code that is not currently needed, but may be used sometime in the future.