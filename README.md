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
# Software Engineer Exercise

This project contains a Java CLI tool for string processing with multithreading support.

## Structure

- `src/main/java`: main source code  
- `src/test/java`: test classes  
- `libs`: external libraries (JUnit)  
- `bin`: compiled classes (ignored)  

## How to Build and Run

Compile:

```bash
# Example PowerShell commands
$files = Get-ChildItem -Recurse -Filter *.java -Path src\main\java,src\test\java | ForEach-Object { $_.FullName }
javac -cp ".;libs\junit-platform-console-standalone-1.9.3.jar" -d bin $files
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

### Run tests:
```java -jar libs\junit-platform-console-standalone-1.9.3.jar --class-path bin --scan-class-path```
