package com.example.a55014.mytest.geogebra.share.commands;

import com.example.a55014.mytest.geogebra.share.Atom;
import com.example.a55014.mytest.geogebra.share.DoubleFramedAtom;
import com.example.a55014.mytest.geogebra.share.TeXParser;

public class CommandDoubleBox extends Command1A {

	@Override
	public Atom newI(TeXParser tp, Atom a) {
		return new DoubleFramedAtom(a);
	}
}