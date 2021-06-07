# Collections
The Collection in Java is a framework that provides an architecture to store and manipulate the group of objects. It can achieve all the operations
that you perform on a data such as searching, sorting, insertion, manipulation, and deletion.

# Comparison
| **Collection**| **Order**  |**Duplicate**  | **Null**     | **Thread Safe** |                   **Usage**                     |
|---------------|------------|---------------|--------------|-----------------|-------------------------------------------------|
|ArrayList      |Insertion   |Yes            |Yes           |No               | Sorting and accessing data                      |
|LinkedList     |Insertion   |Yes            |Yes           |No               | Data manipulation                               |
|HashSet        |No          |No             |Yes           |No               | Search operations                               |
|LinkedHashSet  |Insertion   |No             |Yes           |No               | Maintain insertion order                        |
|TreeSet        |Ascending   |No             |No            |No               | Perform operations and ordered result           |
|PriorityQueue  |No          |Yes            |No            |No               | Processed on priority                           |
|ArrayDeque     |No          |Yes            |No            |No               | Insertion from both ends                        |
|Vector         |Insertion   |Yes            |Yes           |Yes              | Legacy class                                    |
|Stack          |Insertion   |Yes            |Yes           |Yes              | Legacy class                                    |
|HashMap        |No          |Key-N Value-Y  |Key-1 Value-M |No               | Sorting and accessing data                      |
|LinkedHashMap  |Insertion   |Key-N Value-Y  |Key-1 Value-M |No               | Maintain insertion order                        |
|TreeMap        |Ascending   |Key-N Value-Y  |Key-N Value-M |No               | Perform operations and ordered result           |
|HashTable      |No          |Key-N Value-Y  |Key-N Value-N |Yes              | Legacy class                                    |

![](collection.jpg)