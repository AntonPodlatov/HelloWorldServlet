package ru.academit.podlatov.servlet;

import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.io.PrintWriter;
import java.io.Serial;

public class HelloWorldServlet extends HttpServlet {
    @Serial
    private static final long serialVersionUID = 22L;

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse res) {
        try (PrintWriter writer = res.getWriter()) {
            writer.write("hello world");
            writer.flush();
        } catch (IOException e) {
            System.out.println(e.getMessage());
            e.printStackTrace();
        }
    }
}