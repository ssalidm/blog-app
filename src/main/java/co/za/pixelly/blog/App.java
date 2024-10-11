package co.za.pixelly.blog;

import io.javalin.Javalin;
import org.thymeleaf.TemplateEngine;
import org.thymeleaf.context.Context;
import org.thymeleaf.templateresolver.ClassLoaderTemplateResolver;

import java.util.HashMap;
import java.util.Map;

public class App {
    public static void main(String[] args) {
        // Create the 'posts' table in the SQLite database
        Database.createTables();
        
        // Set up Javalin
        Javalin app = Javalin.create().start(7000);

        // Define the homepage route
        app.get("/", ctx -> {
            // Pass model data to Thymeleaf
            Map<String, Object> model = new HashMap<>();
            model.put("message", "Welcome to my Blog!");

            // Render the Thymeleaf template mannually
            String renderedHtml = renderThymeleaf("home.html", model);
            ctx.html(renderedHtml);
        });
    }

    // Helper Method to set up Thymeleaf and render templates
    private static String renderThymeleaf(String templateName, Map<String, Object> model) {
        // Create and configure Thymeleaf Template Engine
        ClassLoaderTemplateResolver templateResolver = new ClassLoaderTemplateResolver();
        templateResolver.setTemplateMode("HTML");
        templateResolver.setPrefix("/templates/");
        templateResolver.setSuffix(".html");

        TemplateEngine templateEngine = new TemplateEngine();
        templateEngine.setTemplateResolver(templateResolver);

        // Create Thymeleaf context and set variables
        Context context = new Context();
        context.setVariables(model);

        // Process and return the template with context
        return templateEngine.process(templateName, context);
    }

}
