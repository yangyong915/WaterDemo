package com.example.a55014.mytest.geogebra.share.commands;

import com.example.a55014.mytest.geogebra.share.Atom;
import com.example.a55014.mytest.geogebra.share.ItAtom;
import com.example.a55014.mytest.geogebra.share.TeXParser;

public class CommandTextIt extends CommandText {

	@Override
	public Atom newI(TeXParser tp, Atom a) {
		return new ItAtom(a);
	}

}