package com.appenspot.cocokoko;

import java.io.IOException;
import javax.servlet.http.*;

public class CoCoKoKoServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public void doGet(HttpServletRequest req, HttpServletResponse resp)
			throws IOException {
		resp.setContentType("text/plain");
		resp.getWriter().println("Hello, world");
	}
}
