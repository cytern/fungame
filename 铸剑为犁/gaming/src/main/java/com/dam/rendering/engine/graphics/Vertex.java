package com.dam.rendering.engine.graphics;

import com.dam.rendering.engine.maths.Vector3f;


public class Vertex {
	private Vector3f position;
	
	public Vertex(Vector3f position) {
		this.position = position;
	}


	public Vector3f getPosition() {
		return position;
	}
}