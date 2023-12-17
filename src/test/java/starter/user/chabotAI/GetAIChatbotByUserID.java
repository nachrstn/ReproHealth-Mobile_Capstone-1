package starter.user.chabotAI;

import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Step;

import static net.serenitybdd.rest.SerenityRest.restAssuredThat;

public class GetAIChatbotByUserID {
    protected static String url = "https://dev.reprohealth.my.id/chatbot/users-health-recommendation/f4df57a4-04cf-4b81-9aef-58dbce4aa37c";

    @Step("I set GET endpoint AI chatbot by user ID")
    public String setGetEndpointAIChatbotByUserID() {
        return url;
    }

    @Step("I send GET HTTP request AI chatbot by user ID")
    public void sendGetRequestAIChatbotByUserID() {
        SerenityRest.given()
                .header("Authorization", "Bearer eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJhdXRob3JpemVkIjp0cnVlLCJuYW1lIjoiQWFhIiwicm9sZSI6InVzZXIiLCJ1c2VyX2lkIjoiZjRkZjU3YTQtMDRjZi00YjgxLTlhZWYtNThkYmNlNGFhMzdjIn0.YFVpLwaAGIPaRSpBfWiCVvKyYD3fWJeZQ_z-Sg798cE")
                .contentType("application/json")
                .when()
                .get(setGetEndpointAIChatbotByUserID());
    }

    @Step("I receive response code 200 for get AI chatbot by user ID")
    public void resCode200GetAIChatbotByUserID() {
        restAssuredThat(response -> response.statusCode(200));
    }
}