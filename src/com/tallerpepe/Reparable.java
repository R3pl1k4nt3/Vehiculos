package com.tallerpepe;

import java.util.Collection;
import java.util.Date;

public interface Reparable {

	Date getFechaEntrada();
	Collection<Reparacion> getReparacionesPendientes();
}
