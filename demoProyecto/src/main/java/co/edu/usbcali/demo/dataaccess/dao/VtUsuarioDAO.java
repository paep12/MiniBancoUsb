package co.edu.usbcali.demo.dataaccess.dao;

import co.edu.usbcali.demo.dataaccess.api.HibernateDaoImpl;
import co.edu.usbcali.demo.modelo.VtUsuario;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

import org.hibernate.criterion.Example;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Scope;

import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

import org.springframework.stereotype.Repository;

import java.math.BigDecimal;

import java.util.Date;
import java.util.List;
import java.util.Set;

import javax.annotation.Resource;


/**
 * A data access object (DAO) providing persistence and search support for
 * VtUsuario entities. Transaction control of the save(), update() and
 * delete() operations can directly support Spring container-managed
 * transactions or they can be augmented to handle user-managed Spring
 * transactions. Each of these methods provides additional information for how
 * to configure it for the desired type of transaction control.
 *
 * @see lidis.VtUsuario
 */
@Scope("singleton")
@Repository("VtUsuarioDAO")
public class VtUsuarioDAO extends HibernateDaoImpl<VtUsuario, Long>
    implements IVtUsuarioDAO {
    private static final Logger log = LoggerFactory.getLogger(VtUsuarioDAO.class);
    @Resource
    private SessionFactory sessionFactory;

    public static IVtUsuarioDAO getFromApplicationContext(
        ApplicationContext ctx) {
        return (IVtUsuarioDAO) ctx.getBean("VtUsuarioDAO");
    }
    
    
    @Override
	public synchronized Long  getConsecutivo() {
		String sqlName="vt_usuario_usua_codigo_seq";
   		Long consecutivo = null;
   		List qlist = null;
   		try {
   			Session session = getSession();
   			Query query = session.getNamedQuery(sqlName);
   			qlist = query.list();
   			consecutivo=(Long)qlist.get(0);
   		} catch (org.hibernate.HibernateException e) {
   			consecutivo = new Long(0);
   		}   		
		return consecutivo;
	}


	@Override
	public VtUsuario findByEmail(String email) {
			VtUsuario usuario = null;
		
		
		Session session = getSession();
		Query query = session.getNamedQuery("consultarUsuariosPorLogin");

		query.setParameter("elLogin", email);
		
//		
		usuario = (VtUsuario)query.uniqueResult();
		
		
		
	
//		
	
		
		return usuario;
	}
}
