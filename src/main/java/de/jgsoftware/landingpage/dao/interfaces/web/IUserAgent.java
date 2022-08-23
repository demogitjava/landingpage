package de.jgsoftware.landingpage.dao.interfaces.web;

import de.jgsoftware.landingpage.model.useragent;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IUserAgent extends JpaRepository<useragent, Long> {
}
