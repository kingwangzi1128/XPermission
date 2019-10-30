/*
 * This file is auto-generated.  DO NOT MODIFY.
 */
package com.yanzhenjie.permission.bridge;
public interface IBridge extends android.os.IInterface
{
  /** Default implementation for IBridge. */
  public static class Default implements com.yanzhenjie.permission.bridge.IBridge
  {
    /**
         * Request for permissions.
         */
    @Override public void requestAppDetails(java.lang.String suffix) throws android.os.RemoteException
    {
    }
    /**
         * Request for permissions.
         */
    @Override public void requestPermission(java.lang.String suffix, java.lang.String[] permissions) throws android.os.RemoteException
    {
    }
    /**
         * Request for package install.
         */
    @Override public void requestInstall(java.lang.String suffix) throws android.os.RemoteException
    {
    }
    /**
        * Request for overlay.
        */
    @Override public void requestOverlay(java.lang.String suffix) throws android.os.RemoteException
    {
    }
    /**
        * Request for alert window.
        */
    @Override public void requestAlertWindow(java.lang.String suffix) throws android.os.RemoteException
    {
    }
    /**
        * Request for notify.
        */
    @Override public void requestNotify(java.lang.String suffix) throws android.os.RemoteException
    {
    }
    /**
        * Request for notification listener.
        */
    @Override public void requestNotificationListener(java.lang.String suffix) throws android.os.RemoteException
    {
    }
    /**
        * Request for write system setting.
        */
    @Override public void requestWriteSetting(java.lang.String suffix) throws android.os.RemoteException
    {
    }
    @Override
    public android.os.IBinder asBinder() {
      return null;
    }
  }
  /** Local-side IPC implementation stub class. */
  public static abstract class Stub extends android.os.Binder implements com.yanzhenjie.permission.bridge.IBridge
  {
    private static final java.lang.String DESCRIPTOR = "com.yanzhenjie.permission.bridge.IBridge";
    /** Construct the stub at attach it to the interface. */
    public Stub()
    {
      this.attachInterface(this, DESCRIPTOR);
    }
    /**
     * Cast an IBinder object into an com.yanzhenjie.permission.bridge.IBridge interface,
     * generating a proxy if needed.
     */
    public static com.yanzhenjie.permission.bridge.IBridge asInterface(android.os.IBinder obj)
    {
      if ((obj==null)) {
        return null;
      }
      android.os.IInterface iin = obj.queryLocalInterface(DESCRIPTOR);
      if (((iin!=null)&&(iin instanceof com.yanzhenjie.permission.bridge.IBridge))) {
        return ((com.yanzhenjie.permission.bridge.IBridge)iin);
      }
      return new com.yanzhenjie.permission.bridge.IBridge.Stub.Proxy(obj);
    }
    @Override public android.os.IBinder asBinder()
    {
      return this;
    }
    @Override public boolean onTransact(int code, android.os.Parcel data, android.os.Parcel reply, int flags) throws android.os.RemoteException
    {
      java.lang.String descriptor = DESCRIPTOR;
      switch (code)
      {
        case INTERFACE_TRANSACTION:
        {
          reply.writeString(descriptor);
          return true;
        }
        case TRANSACTION_requestAppDetails:
        {
          data.enforceInterface(descriptor);
          java.lang.String _arg0;
          _arg0 = data.readString();
          this.requestAppDetails(_arg0);
          reply.writeNoException();
          return true;
        }
        case TRANSACTION_requestPermission:
        {
          data.enforceInterface(descriptor);
          java.lang.String _arg0;
          _arg0 = data.readString();
          java.lang.String[] _arg1;
          _arg1 = data.createStringArray();
          this.requestPermission(_arg0, _arg1);
          reply.writeNoException();
          return true;
        }
        case TRANSACTION_requestInstall:
        {
          data.enforceInterface(descriptor);
          java.lang.String _arg0;
          _arg0 = data.readString();
          this.requestInstall(_arg0);
          reply.writeNoException();
          return true;
        }
        case TRANSACTION_requestOverlay:
        {
          data.enforceInterface(descriptor);
          java.lang.String _arg0;
          _arg0 = data.readString();
          this.requestOverlay(_arg0);
          reply.writeNoException();
          return true;
        }
        case TRANSACTION_requestAlertWindow:
        {
          data.enforceInterface(descriptor);
          java.lang.String _arg0;
          _arg0 = data.readString();
          this.requestAlertWindow(_arg0);
          reply.writeNoException();
          return true;
        }
        case TRANSACTION_requestNotify:
        {
          data.enforceInterface(descriptor);
          java.lang.String _arg0;
          _arg0 = data.readString();
          this.requestNotify(_arg0);
          reply.writeNoException();
          return true;
        }
        case TRANSACTION_requestNotificationListener:
        {
          data.enforceInterface(descriptor);
          java.lang.String _arg0;
          _arg0 = data.readString();
          this.requestNotificationListener(_arg0);
          reply.writeNoException();
          return true;
        }
        case TRANSACTION_requestWriteSetting:
        {
          data.enforceInterface(descriptor);
          java.lang.String _arg0;
          _arg0 = data.readString();
          this.requestWriteSetting(_arg0);
          reply.writeNoException();
          return true;
        }
        default:
        {
          return super.onTransact(code, data, reply, flags);
        }
      }
    }
    private static class Proxy implements com.yanzhenjie.permission.bridge.IBridge
    {
      private android.os.IBinder mRemote;
      Proxy(android.os.IBinder remote)
      {
        mRemote = remote;
      }
      @Override public android.os.IBinder asBinder()
      {
        return mRemote;
      }
      public java.lang.String getInterfaceDescriptor()
      {
        return DESCRIPTOR;
      }
      /**
           * Request for permissions.
           */
      @Override public void requestAppDetails(java.lang.String suffix) throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain();
        android.os.Parcel _reply = android.os.Parcel.obtain();
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          _data.writeString(suffix);
          boolean _status = mRemote.transact(Stub.TRANSACTION_requestAppDetails, _data, _reply, 0);
          if (!_status && getDefaultImpl() != null) {
            getDefaultImpl().requestAppDetails(suffix);
            return;
          }
          _reply.readException();
        }
        finally {
          _reply.recycle();
          _data.recycle();
        }
      }
      /**
           * Request for permissions.
           */
      @Override public void requestPermission(java.lang.String suffix, java.lang.String[] permissions) throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain();
        android.os.Parcel _reply = android.os.Parcel.obtain();
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          _data.writeString(suffix);
          _data.writeStringArray(permissions);
          boolean _status = mRemote.transact(Stub.TRANSACTION_requestPermission, _data, _reply, 0);
          if (!_status && getDefaultImpl() != null) {
            getDefaultImpl().requestPermission(suffix, permissions);
            return;
          }
          _reply.readException();
        }
        finally {
          _reply.recycle();
          _data.recycle();
        }
      }
      /**
           * Request for package install.
           */
      @Override public void requestInstall(java.lang.String suffix) throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain();
        android.os.Parcel _reply = android.os.Parcel.obtain();
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          _data.writeString(suffix);
          boolean _status = mRemote.transact(Stub.TRANSACTION_requestInstall, _data, _reply, 0);
          if (!_status && getDefaultImpl() != null) {
            getDefaultImpl().requestInstall(suffix);
            return;
          }
          _reply.readException();
        }
        finally {
          _reply.recycle();
          _data.recycle();
        }
      }
      /**
          * Request for overlay.
          */
      @Override public void requestOverlay(java.lang.String suffix) throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain();
        android.os.Parcel _reply = android.os.Parcel.obtain();
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          _data.writeString(suffix);
          boolean _status = mRemote.transact(Stub.TRANSACTION_requestOverlay, _data, _reply, 0);
          if (!_status && getDefaultImpl() != null) {
            getDefaultImpl().requestOverlay(suffix);
            return;
          }
          _reply.readException();
        }
        finally {
          _reply.recycle();
          _data.recycle();
        }
      }
      /**
          * Request for alert window.
          */
      @Override public void requestAlertWindow(java.lang.String suffix) throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain();
        android.os.Parcel _reply = android.os.Parcel.obtain();
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          _data.writeString(suffix);
          boolean _status = mRemote.transact(Stub.TRANSACTION_requestAlertWindow, _data, _reply, 0);
          if (!_status && getDefaultImpl() != null) {
            getDefaultImpl().requestAlertWindow(suffix);
            return;
          }
          _reply.readException();
        }
        finally {
          _reply.recycle();
          _data.recycle();
        }
      }
      /**
          * Request for notify.
          */
      @Override public void requestNotify(java.lang.String suffix) throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain();
        android.os.Parcel _reply = android.os.Parcel.obtain();
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          _data.writeString(suffix);
          boolean _status = mRemote.transact(Stub.TRANSACTION_requestNotify, _data, _reply, 0);
          if (!_status && getDefaultImpl() != null) {
            getDefaultImpl().requestNotify(suffix);
            return;
          }
          _reply.readException();
        }
        finally {
          _reply.recycle();
          _data.recycle();
        }
      }
      /**
          * Request for notification listener.
          */
      @Override public void requestNotificationListener(java.lang.String suffix) throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain();
        android.os.Parcel _reply = android.os.Parcel.obtain();
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          _data.writeString(suffix);
          boolean _status = mRemote.transact(Stub.TRANSACTION_requestNotificationListener, _data, _reply, 0);
          if (!_status && getDefaultImpl() != null) {
            getDefaultImpl().requestNotificationListener(suffix);
            return;
          }
          _reply.readException();
        }
        finally {
          _reply.recycle();
          _data.recycle();
        }
      }
      /**
          * Request for write system setting.
          */
      @Override public void requestWriteSetting(java.lang.String suffix) throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain();
        android.os.Parcel _reply = android.os.Parcel.obtain();
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          _data.writeString(suffix);
          boolean _status = mRemote.transact(Stub.TRANSACTION_requestWriteSetting, _data, _reply, 0);
          if (!_status && getDefaultImpl() != null) {
            getDefaultImpl().requestWriteSetting(suffix);
            return;
          }
          _reply.readException();
        }
        finally {
          _reply.recycle();
          _data.recycle();
        }
      }
      public static com.yanzhenjie.permission.bridge.IBridge sDefaultImpl;
    }
    static final int TRANSACTION_requestAppDetails = (android.os.IBinder.FIRST_CALL_TRANSACTION + 0);
    static final int TRANSACTION_requestPermission = (android.os.IBinder.FIRST_CALL_TRANSACTION + 1);
    static final int TRANSACTION_requestInstall = (android.os.IBinder.FIRST_CALL_TRANSACTION + 2);
    static final int TRANSACTION_requestOverlay = (android.os.IBinder.FIRST_CALL_TRANSACTION + 3);
    static final int TRANSACTION_requestAlertWindow = (android.os.IBinder.FIRST_CALL_TRANSACTION + 4);
    static final int TRANSACTION_requestNotify = (android.os.IBinder.FIRST_CALL_TRANSACTION + 5);
    static final int TRANSACTION_requestNotificationListener = (android.os.IBinder.FIRST_CALL_TRANSACTION + 6);
    static final int TRANSACTION_requestWriteSetting = (android.os.IBinder.FIRST_CALL_TRANSACTION + 7);
    public static boolean setDefaultImpl(com.yanzhenjie.permission.bridge.IBridge impl) {
      if (Stub.Proxy.sDefaultImpl == null && impl != null) {
        Stub.Proxy.sDefaultImpl = impl;
        return true;
      }
      return false;
    }
    public static com.yanzhenjie.permission.bridge.IBridge getDefaultImpl() {
      return Stub.Proxy.sDefaultImpl;
    }
  }
  /**
       * Request for permissions.
       */
  public void requestAppDetails(java.lang.String suffix) throws android.os.RemoteException;
  /**
       * Request for permissions.
       */
  public void requestPermission(java.lang.String suffix, java.lang.String[] permissions) throws android.os.RemoteException;
  /**
       * Request for package install.
       */
  public void requestInstall(java.lang.String suffix) throws android.os.RemoteException;
  /**
      * Request for overlay.
      */
  public void requestOverlay(java.lang.String suffix) throws android.os.RemoteException;
  /**
      * Request for alert window.
      */
  public void requestAlertWindow(java.lang.String suffix) throws android.os.RemoteException;
  /**
      * Request for notify.
      */
  public void requestNotify(java.lang.String suffix) throws android.os.RemoteException;
  /**
      * Request for notification listener.
      */
  public void requestNotificationListener(java.lang.String suffix) throws android.os.RemoteException;
  /**
      * Request for write system setting.
      */
  public void requestWriteSetting(java.lang.String suffix) throws android.os.RemoteException;
}
