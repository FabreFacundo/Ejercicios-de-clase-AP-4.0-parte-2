package com.TransformadorMayusMinus.interfaces;

import java.util.ArrayList;

@FunctionalInterface
public interface Transformador {
	public ArrayList<String> transformar(ArrayList<String> stringAConvertir);
}
