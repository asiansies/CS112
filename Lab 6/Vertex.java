import java.util.ArrayList;

public class Vertex {
	String value;
	ArrayList<Edge> edges;
	
	public Vertex(String value) {
		this.value = value;
	}
}

class Edge {
	int value;
	Vertex vertex0;
	Vertex vertex1;
	
	public Edge(int x, Vertex vertex0, Vertex vertex1) {
		this.value = x;
		this.vertex0 = vertex0;
		this.vertex1 = vertex1;
	}
}

class Graph {
	ArrayList<Vertex> vertices = new ArrayList<Vertex>();
	ArrayList<Edge> edges = new ArrayList<Edge>();
	
	public ArrayList vertices() {
		return vertices;
		
	}
	
	public ArrayList edges() {
		return edges;
	}
	
	public boolean adjacent(Vertex v1, Vertex v2) {
		for (int i = 0; i < v1.edges.size(); i++) {
			if (edges.get(i).vertex0.equals(v1) && edges.get(i).vertex1.equals(v2)) {
				return true;
			}
			if (edges.get(i).vertex0.equals(v2) && edges.get(i).vertex1.equals(v1)) {
				return true;
			}
		}
		return false;
	} 
	
	public Vertex opposite(Vertex v, Edge e) {

		if (e.vertex0 != null && e.vertex1 != null) {
			if (v == e.vertex0) {
				return e.vertex1; 
			}
		}
		return e.vertex0;
	}
	
	public void replace(Vertex v, int x) {
		vertices.set(x, v);
	}
	
	public Vertex insertVertex(String x) {
		Vertex vx = new Vertex(x);
		vertices.add(vx);
		return vx;
	}
	
	public Edge insertEdge(int x, Vertex v1, Vertex v2) {
		Edge newEdge = new Edge(x, v1, v2);
		
		v1.edges.add(newEdge);
		v2.edges.add(newEdge);
		edges.add(newEdge);
		
		return newEdge;
	}
}
