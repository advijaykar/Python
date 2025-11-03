import dev.langchain4j.model.chat.ChatLanguageModel;
import dev.langchain4j.model.openai.OpenAiChatModel;

public class LLMExample {
    public static void main(String[] args) {
        ChatLanguageModel model = OpenAiChatModel.builder()
            .apiKey(System.getenv("OPENAI_API_KEY")) // Set your OpenAI API key in environment variables
            .modelName("gpt-4")
            .temperature(0.7)
            .maxTokens(150)
            .build();
        String response = model.chat("What is the capital of Canada?");
        System.out.println(response);
    }
}
