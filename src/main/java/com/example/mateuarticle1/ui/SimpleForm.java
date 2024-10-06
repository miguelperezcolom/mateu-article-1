package com.example.mateuarticle1.ui;

import io.mateu.core.domain.uidefinition.core.interfaces.Message;
import io.mateu.core.domain.uidefinition.shared.annotations.MainAction;
import io.mateu.core.domain.uidefinition.shared.annotations.MateuUI;
import io.mateu.core.domain.uidefinition.shared.annotations.TextArea;
import io.mateu.dtos.ResultType;
import lombok.Getter;
import lombok.Setter;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;

import java.util.UUID;

@MateuUI("/form")             // this sets the url
@Service@Scope("prototype")   // use prototype scope if you do not want every user to share the same form
@Getter@Setter                // needed to make the fields visible in the form
public class SimpleForm {

    String email;

    String subject;

    @TextArea
    String body;

    @MainAction
    public Message send() {
        // send the email
        return new Message(
                ResultType.Success,
                "Message sent",
                "Your message to " + email + " has been sent :)", 5000);
    }

}
