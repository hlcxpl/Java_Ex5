# Java Exercises

This project contains a series of Java exercises that demonstrate the use of various data structures and algorithms, including sets, maps, and graph traversal techniques. Each exercise is implemented in its own Java file located in the `src` directory.

## Exercises Overview

1. **Intersection of Two Sets** (`src/MainIntersection.java`): 
   - Computes the intersection of two sets using `HashSet`.
   - Demonstrates set operations.

2. **Difference of Two Sets** (`src/MainDifference.java`): 
   - Computes the difference between two sets.
   - Utilizes `HashSet` to find elements present in one set but not in another.

3. **Subset Check** (`src/MainSubsetCheck.java`): 
   - Checks if one set is a subset of another.
   - Uses the `containsAll` method of `HashSet`.

4. **Unique Words Extraction** (`src/MainUniqueWords.java`): 
   - Extracts unique words from a given text.
   - Uses a `HashSet` to ensure word uniqueness.

5. **Word Frequency Calculation** (`src/MainWordFrequency.java`): 
   - Calculates the frequency of each word in a given string.
   - Utilizes a `HashMap` to count occurrences.

6. **Invert Map** (`src/MainInvertMap.java`): 
   - Inverts a map by switching keys and values.
   - Demonstrates the use of `HashMap` for creating a new map with inverted key-value pairs.

7. **Graph Utilities** (`src/utils/GraphUtils.java`): 
   - Contains utility methods for graph operations, such as traversals (BFS and DFS).
   - May include methods to represent graphs using adjacency lists or matrices.

## Project Setup

To run the exercises, ensure you have Java and Maven installed on your machine. Follow these steps:

1. Clone the repository or download the project files.
2. Navigate to the project directory.
3. Use Maven to build the project:
   ```
   mvn clean install
   ```
4. Run the desired exercise using the following command:
   ```
   java -cp target/classes <MainClassName>
   ```
   Replace `<MainClassName>` with the name of the main class you wish to run (e.g., `MainIntersection`).

## Concepts Implemented

- HashSets and HashMaps for efficient data storage and retrieval.
- Set operations such as intersection, difference, and subset checking.
- String manipulation for unique word extraction and frequency counting.
- Graph representation and traversal techniques.

Feel free to explore each exercise and modify the code to enhance your understanding of these concepts!