package sop_corba;


/**
* sop_corba/_ObtenerEstadisticasIntStub.java .
* Generated by the IDL-to-Java compiler (portable), version "3.2"
* from operaciones.idl
* jueves 8 de junio de 2023 11:42:00 AM COT
*/

public class _ObtenerEstadisticasIntStub extends org.omg.CORBA.portable.ObjectImpl implements sop_corba.ObtenerEstadisticasInt
{

  public boolean registrarValorOferta (float valor)
  {
            org.omg.CORBA.portable.InputStream $in = null;
            try {
                org.omg.CORBA.portable.OutputStream $out = _request ("registrarValorOferta", true);
                $out.write_float (valor);
                $in = _invoke ($out);
                boolean $result = $in.read_boolean ();
                return $result;
            } catch (org.omg.CORBA.portable.ApplicationException $ex) {
                $in = $ex.getInputStream ();
                String _id = $ex.getId ();
                throw new org.omg.CORBA.MARSHAL (_id);
            } catch (org.omg.CORBA.portable.RemarshalException $rm) {
                return registrarValorOferta (valor        );
            } finally {
                _releaseReply ($in);
            }
  } // registrarValorOferta

  public float consultarMayorOferta ()
  {
            org.omg.CORBA.portable.InputStream $in = null;
            try {
                org.omg.CORBA.portable.OutputStream $out = _request ("consultarMayorOferta", true);
                $in = _invoke ($out);
                float $result = $in.read_float ();
                return $result;
            } catch (org.omg.CORBA.portable.ApplicationException $ex) {
                $in = $ex.getInputStream ();
                String _id = $ex.getId ();
                throw new org.omg.CORBA.MARSHAL (_id);
            } catch (org.omg.CORBA.portable.RemarshalException $rm) {
                return consultarMayorOferta (        );
            } finally {
                _releaseReply ($in);
            }
  } // consultarMayorOferta

  public void consultarEstadisticas (sop_corba.ObtenerEstadisticasIntPackage.estadisticasDTOHolder resultado)
  {
            org.omg.CORBA.portable.InputStream $in = null;
            try {
                org.omg.CORBA.portable.OutputStream $out = _request ("consultarEstadisticas", true);
                $in = _invoke ($out);
                resultado.value = sop_corba.ObtenerEstadisticasIntPackage.estadisticasDTOHelper.read ($in);
                return;
            } catch (org.omg.CORBA.portable.ApplicationException $ex) {
                $in = $ex.getInputStream ();
                String _id = $ex.getId ();
                throw new org.omg.CORBA.MARSHAL (_id);
            } catch (org.omg.CORBA.portable.RemarshalException $rm) {
                consultarEstadisticas (resultado        );
            } finally {
                _releaseReply ($in);
            }
  } // consultarEstadisticas

  // Type-specific CORBA::Object operations
  private static String[] __ids = {
    "IDL:sop_corba/ObtenerEstadisticasInt:1.0"};

  public String[] _ids ()
  {
    return (String[])__ids.clone ();
  }

  private void readObject (java.io.ObjectInputStream s) throws java.io.IOException
  {
     String str = s.readUTF ();
     String[] args = null;
     java.util.Properties props = null;
     org.omg.CORBA.ORB orb = org.omg.CORBA.ORB.init (args, props);
   try {
     org.omg.CORBA.Object obj = orb.string_to_object (str);
     org.omg.CORBA.portable.Delegate delegate = ((org.omg.CORBA.portable.ObjectImpl) obj)._get_delegate ();
     _set_delegate (delegate);
   } finally {
     orb.destroy() ;
   }
  }

  private void writeObject (java.io.ObjectOutputStream s) throws java.io.IOException
  {
     String[] args = null;
     java.util.Properties props = null;
     org.omg.CORBA.ORB orb = org.omg.CORBA.ORB.init (args, props);
   try {
     String str = orb.object_to_string (this);
     s.writeUTF (str);
   } finally {
     orb.destroy() ;
   }
  }
} // class _ObtenerEstadisticasIntStub
