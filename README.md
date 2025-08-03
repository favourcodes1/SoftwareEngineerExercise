# Software Engineer Java CLI Exercise

## Author
Favour Ogubuike

## Description
This Java command-line tool processes an input text file using specified data operations (`capitalize`, `reverse`, `neg`) on `string`, `int`, or `double` input types. It supports multi-threaded processing and outputs transformed data along with statistics.

## Features
- ✅ Command-line parsing
- ✅ Modular operation pipeline
- ✅ Support for `string`, `int`, `double` types
- ✅ Operations: `capitalize`, `reverse`, `neg`
- ✅ Multithreading with chunk-based processing
- ✅ JUnit 5 test cases
- ✅ Javadoc

## How to Compile and Run

### Compile
```bash
javac -d out src/org/favourogubuike/**/*.java
```

### Run
```bash
java -cp out org.favourogubuike.Main \
  --input input.txt \
  --inputtype string \
  --operations capitalize,reverse \
  --threads 2 \
  --output output.txt
```

## Tests
Run using any JUnit 5 compatible runner or from an IDE.
