# Collections
The Collection in Java is a framework that provides an architecture to store and manipulate the group of objects. It can achieve all the operations
that you perform on a data such as searching, sorting, insertion, manipulation, and deletion.

# Comparison
| **Collection**| **Order**  |**Duplicate**  | **Null**  | **Thread Safe**  | **Random Access** |                   **Usage**                     |
|---------------|------------|---------------|-----------|------------------|-------------------|-------------------------------------------------|
|ArrayList      |Insertion   |Yes            |Yes        | No               | Yes               | Sorting and accessing data                      |
|LinkedList     |Insertion   |Yes            |Yes        | No               | No                | Data manipulation                               |
|HashSet        |No          |No             |Yes        | No               | No                | Search operations                               |
|LinkedHashSet  |Insertion   |No             |Yes        | No               | No                | Maintain insertion order                        |
|TreeSet        |Ascending   |No             |No         | No               | No                | Perform operations and ordered result           |
|PriorityQueue  |No          |Yes            |No         | No               | No                | Processed on priority                           |
|ArrayDeque     |No          |Yes            |No         | No               | No                | Insertion from both ends                        |
|Vector         |Insertion   |Yes            |Yes        | Yes              | Yes               | Legacy class                                    |
|Stack          |Insertion   |Yes            |Yes        | Yes              | Yes               | Legacy class                                    |

![](collections.jpg)