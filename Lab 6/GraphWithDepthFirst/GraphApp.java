package GraphWithDepthFirst;

public class GraphApp {

	public static void main(String[] args) {
		Graph graph = new Graph();
		Vertex vBOS = graph.insertVertex("BOS");
		Vertex vJFK = graph.insertVertex("JFK");
		Vertex vMIA = graph.insertVertex("MIA");
		
		graph.insertEdge(187, vBOS, vJFK);
		graph.insertEdge(1090, vJFK, vMIA);
		graph.insertEdge(1258, vMIA, vBOS);
		
		Graph graph2 = new Graph();
		Vertex vBOS2 = graph2.insertVertex("BOS");
		Vertex vMIA2 = graph2.insertVertex("MIA");
		Vertex vJFK2 = graph2.insertVertex("JFK");
		Vertex vORD = graph2.insertVertex("ORD");
		Vertex vDFW = graph2.insertVertex("DFW");
		Vertex vSFO = graph2.insertVertex("SFO");
		Vertex vLAX = graph2.insertVertex("LAX");
		
		graph2.insertEdge(2704, vBOS2, vSFO);
		graph2.insertEdge(867, vBOS2, vORD);
		graph2.insertEdge(187, vBOS2, vJFK2);
		graph2.insertEdge(1258, vBOS2, vMIA2);
		graph2.insertEdge(1846, vSFO, vORD);
		graph2.insertEdge(740, vORD, vJFK2);
		graph2.insertEdge(1090, vMIA2, vJFK2);
		graph2.insertEdge(1464, vSFO, vDFW);
		graph2.insertEdge(802, vORD, vDFW);
		graph2.insertEdge(1121, vDFW, vMIA2);
		graph2.insertEdge(337, vSFO, vLAX);
		graph2.insertEdge(1235, vLAX, vDFW);
		graph2.insertEdge(2342, vLAX, vMIA2);

		
		graph.depthFirst(vBOS);
	}

}
