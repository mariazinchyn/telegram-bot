import org.telegram.telegrambots.bots.TelegramLongPollingBot;
import org.telegram.telegrambots.meta.api.methods.send.SendMessage;
import org.telegram.telegrambots.meta.api.objects.Update;
import org.telegram.telegrambots.meta.exceptions.TelegramApiException;

public class MariaBogdanivnaBot extends TelegramLongPollingBot {
    public String getBotUsername() {
        return "mariabogdanivna_bot";
    }

    public String getBotToken() {
        return "1754750254:AAGTZUvFtY5PixuvnkKysi7bgyIT95x4gug";
    }

    public void onUpdateReceived(Update update) {
        // We check if the update has a message and the message has text






       System.out.println(update.getMessage().getText());
       System.out.println(update.getMessage().getFrom().getFirstName());


  //  String command=update.getMessage().getText();
   // if (command.equals("myname")){
   //     System.out.println(update.getMessage().getFrom().getFirstName());
   // }

    }
}

