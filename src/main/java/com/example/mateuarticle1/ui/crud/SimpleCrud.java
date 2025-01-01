package com.example.mateuarticle1.ui.crud;

import io.mateu.uidl.annotations.MateuUI;
import io.mateu.uidl.interfaces.Crud;
import lombok.extern.slf4j.Slf4j;
import org.springframework.context.annotation.Scope;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Component;
import reactor.core.publisher.Mono;

@MateuUI("/crud")
@Component@Scope("prototype")
@Slf4j
public class SimpleCrud implements Crud<SearchForm, Row> {

    final SimpleCrudService service;

    public SimpleCrud(SimpleCrudService service) {
        this.service = service;
    }

    @Override
    public Mono<Page<Row>> fetchRows(String searchText, SearchForm filters, Pageable pageable) throws Throwable {
        return service.fetchRows(searchText, filters, pageable);
    }

}
