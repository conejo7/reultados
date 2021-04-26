package com.ecua.slb.entity;

import javax.persistence.Entity;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

//import model.Historia;

import java.math.BigDecimal;
import java.sql.Time;
import java.sql.Timestamp;
import java.util.Date;

import javax.persistence.Column;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;


@Entity
@Table(name="xml_resultado",schema = "persona")

public class XmlResultado {
	private static final long serialVersionUID = 1L;

	@Id
	private Long id;

	private String antecedentes;

	private String aptitud;

	@Column(name="arch_user")
	private String archUser;

	@Column(name="audit_user")
	private String auditUser;

	@Column(name="aux_ciudad")
	private String auxCiudad;

	@Column(name="cod_ana")
	private String codAna;

	@Column(name="cod_ori")
	private String codOri;

	@Column(name="cod_pac")
	private BigDecimal codPac;

	private String codigo;

	@Column(name="des_ori")
	private String desOri;

	private String dx;

	private String empresa;

	private String estado;

	@Column(name="fec_arch")
	private Timestamp fecArch;

	@Column(name="fec_ini")
	private Timestamp fecIni;

	@Column(name="fec_upd")
	private Timestamp fecUpd;

	@Temporal(TemporalType.DATE)
	private Date fecha;

	@Column(name="fecha_audit")
	private Timestamp fechaAudit;

//	@Column(name="first_oid")
//	private Object firstOid;

	@Column(name="first_user")
	private String firstUser;

	private Time hora;

	@Column(name="id_medico")
	private Integer idMedico;

	@Column(name="id_orden")
	private Long idOrden;

	@Column(name="id_orden_nextlab")
	private BigDecimal idOrdenNextlab;

	@Column(name="id_practica")
	private Integer idPractica;

//	@Column(name="last_oid")
//	private Object lastOid;

	@Column(name="last_user")
	private String lastUser;

	private String linck;

	@Column(name="lk_img")
	private String lkImg;

	@Column(name="lock_reg")
	private BigDecimal lockReg;

	private String medico;

	@Column(name="nro_ord")
	private BigDecimal nroOrd;

	@Column(name="origen_ciudad")
	private String origenCiudad;

	private String resultado;

	@Column(name="sts_inf")
	private BigDecimal stsInf;

	//bi-directional many-to-one association to Historia
	//@ManyToOne
	//@JoinColumn(name="id_historia")
	//private Historia historia;

	public XmlResultado() {
	}

	public Long getId() {
		return this.id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getAntecedentes() {
		return this.antecedentes;
	}

	public void setAntecedentes(String antecedentes) {
		this.antecedentes = antecedentes;
	}

	public String getAptitud() {
		return this.aptitud;
	}

	public void setAptitud(String aptitud) {
		this.aptitud = aptitud;
	}

	public String getArchUser() {
		return this.archUser;
	}

	public void setArchUser(String archUser) {
		this.archUser = archUser;
	}

	public String getAuditUser() {
		return this.auditUser;
	}

	public void setAuditUser(String auditUser) {
		this.auditUser = auditUser;
	}

	public String getAuxCiudad() {
		return this.auxCiudad;
	}

	public void setAuxCiudad(String auxCiudad) {
		this.auxCiudad = auxCiudad;
	}

	public String getCodAna() {
		return this.codAna;
	}

	public void setCodAna(String codAna) {
		this.codAna = codAna;
	}

	public String getCodOri() {
		return this.codOri;
	}

	public void setCodOri(String codOri) {
		this.codOri = codOri;
	}

	public BigDecimal getCodPac() {
		return this.codPac;
	}

	public void setCodPac(BigDecimal codPac) {
		this.codPac = codPac;
	}

	public String getCodigo() {
		return this.codigo;
	}

	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}

	public String getDesOri() {
		return this.desOri;
	}

	public void setDesOri(String desOri) {
		this.desOri = desOri;
	}

	public String getDx() {
		return this.dx;
	}

	public void setDx(String dx) {
		this.dx = dx;
	}

	public String getEmpresa() {
		return this.empresa;
	}

	public void setEmpresa(String empresa) {
		this.empresa = empresa;
	}

	public String getEstado() {
		return this.estado;
	}

	public void setEstado(String estado) {
		this.estado = estado;
	}

	public Timestamp getFecArch() {
		return this.fecArch;
	}

	public void setFecArch(Timestamp fecArch) {
		this.fecArch = fecArch;
	}

	public Timestamp getFecIni() {
		return this.fecIni;
	}

	public void setFecIni(Timestamp fecIni) {
		this.fecIni = fecIni;
	}

	public Timestamp getFecUpd() {
		return this.fecUpd;
	}

	public void setFecUpd(Timestamp fecUpd) {
		this.fecUpd = fecUpd;
	}

	public Date getFecha() {
		return this.fecha;
	}

	public void setFecha(Date fecha) {
		this.fecha = fecha;
	}

	public Timestamp getFechaAudit() {
		return this.fechaAudit;
	}

	public void setFechaAudit(Timestamp fechaAudit) {
		this.fechaAudit = fechaAudit;
	}

//	public Object getFirstOid() {
//		return this.firstOid;
//	}
//
//	public void setFirstOid(Object firstOid) {
//		this.firstOid = firstOid;
//	}

	public String getFirstUser() {
		return this.firstUser;
	}

	public void setFirstUser(String firstUser) {
		this.firstUser = firstUser;
	}

	public Time getHora() {
		return this.hora;
	}

	public void setHora(Time hora) {
		this.hora = hora;
	}

	public Integer getIdMedico() {
		return this.idMedico;
	}

	public void setIdMedico(Integer idMedico) {
		this.idMedico = idMedico;
	}

	public Long getIdOrden() {
		return this.idOrden;
	}

	public void setIdOrden(Long idOrden) {
		this.idOrden = idOrden;
	}

	public BigDecimal getIdOrdenNextlab() {
		return this.idOrdenNextlab;
	}

	public void setIdOrdenNextlab(BigDecimal idOrdenNextlab) {
		this.idOrdenNextlab = idOrdenNextlab;
	}

	public Integer getIdPractica() {
		return this.idPractica;
	}

	public void setIdPractica(Integer idPractica) {
		this.idPractica = idPractica;
	}

//	public Object getLastOid() {
//		return this.lastOid;
//	}
//
//	public void setLastOid(Object lastOid) {
//		this.lastOid = lastOid;
//	}

	public String getLastUser() {
		return this.lastUser;
	}

	public void setLastUser(String lastUser) {
		this.lastUser = lastUser;
	}

	public String getLinck() {
		return this.linck;
	}

	public void setLinck(String linck) {
		this.linck = linck;
	}

	public String getLkImg() {
		return this.lkImg;
	}

	public void setLkImg(String lkImg) {
		this.lkImg = lkImg;
	}

	public BigDecimal getLockReg() {
		return this.lockReg;
	}

	public void setLockReg(BigDecimal lockReg) {
		this.lockReg = lockReg;
	}

	public String getMedico() {
		return this.medico;
	}

	public void setMedico(String medico) {
		this.medico = medico;
	}

	public BigDecimal getNroOrd() {
		return this.nroOrd;
	}

	public void setNroOrd(BigDecimal nroOrd) {
		this.nroOrd = nroOrd;
	}

	public String getOrigenCiudad() {
		return this.origenCiudad;
	}

	public void setOrigenCiudad(String origenCiudad) {
		this.origenCiudad = origenCiudad;
	}

	public String getResultado() {
		return this.resultado;
	}

	public void setResultado(String resultado) {
		this.resultado = resultado;
	}

	public BigDecimal getStsInf() {
		return this.stsInf;
	}

	public void setStsInf(BigDecimal stsInf) {
		this.stsInf = stsInf;
	}

//	public Historia getHistoria() {
//		return this.historia;
//	}
//
//	public void setHistoria(Historia historia) {
//		this.historia = historia;
//	}

	
}
