
# Multithreaded Notepad Application

A feature-rich **Multithreaded Notepad Application** designed in Java. This project was developed as part of a class assignment to demonstrate proficiency in Java programming concepts such as **multithreading**, **file I/O**, and **string manipulation**.

---

## Features

- **Multithreading**: Smooth and responsive UI with background threads handling file operations and autocorrection.
- **Save and Read Files**: Save notes to and read notes from text files seamlessly.
- **Autocorrect Functionality**: Automatically correct common typos and grammatical issues in real-time.
- **Multiple Spaces Correction**: Automatically trims multiple spaces into a single space for cleaner text formatting.

---

## Technologies Used

- **Java Swing**: For the graphical user interface.
- **Java I/O Streams**: To handle file reading and writing.
- **Multithreading**: For handling long-running operations like file I/O and autocorrection without freezing the UI.
- **Regex (Regular Expressions)**: For text corrections, such as multiple space removal and typo fixing.

---

## How It Works

### **Multithreading**
- File operations like saving and loading notes are performed in a separate thread to ensure the application remains responsive.
- Autocorrect runs as a background thread, analyzing and updating the text while the user types.

### **File I/O**
- Users can **save** their notes to a `.txt` file using the "Save" button.
- Files can be **loaded** into the notepad using the "Open" button, supporting plain text format.

### **Text Correction**
- The autocorrect feature fixes common errors as you type (e.g., replacing "teh" with "the").
- Extra spaces are removed automatically, converting "This   is   a test" to "This is a test."

---

## Acknowledgements 
- This project was developed as part of a Java programming class. Special thanks to the instructor, Dr. Islam Elgedawy,  and peers for their guidance and feedback.

---

## License 

This project is under the MIT license, read the LICENSE file for more information
