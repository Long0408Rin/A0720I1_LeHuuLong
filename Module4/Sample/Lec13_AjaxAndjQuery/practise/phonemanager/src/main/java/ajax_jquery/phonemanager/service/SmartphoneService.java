package ajax_jquery.phonemanager.service;

import ajax_jquery.phonemanager.model.Smartphone;

public interface SmartphoneService {
    Iterable<Smartphone> findAll();

    Smartphone findById(Integer id);

    Smartphone save(Smartphone phone);

    Smartphone remove(Integer id);
}
