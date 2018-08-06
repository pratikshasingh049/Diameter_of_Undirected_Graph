# Diameter_of_Undirected_Graph
Java code that calculates diameter of an undirected graph.

The diameter of a graph is the maximum eccentricity of any vertex in the graph. That is, it is the greatest distance between any pair of vertices. To find the diameter of a graph, first find the shortest path between each pair of vertices. The greatest length of any of these paths is the diameter of the graph.

The program should accept a graph definition from a text file that has the following structure:

A – B
B – C
B – D
D – E

where “A”, “B”, “C”, “D” and “E” are names of the nodes and “-” depicts a path between the nodes. Node name can be any sequence of upper case letters and numbers without spaces e.g. “A2B3”. The diameter of this graph is 3 btw.

If graph is disconnected:

A – B
B – C
D – E

its diameter should be Integer.MAX_VALUE.

The program should print the diameter calculated in standard output.
