package com.interviewprep;

import java.io.IOException;
import java.util.List;

public interface IInputFileHandler {
	public List<String> readAllLines() throws IOException;
}
