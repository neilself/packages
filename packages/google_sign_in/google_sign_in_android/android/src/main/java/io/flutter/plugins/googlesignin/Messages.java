// Copyright 2013 The Flutter Authors. All rights reserved.
// Use of this source code is governed by a BSD-style license that can be
// found in the LICENSE file.
// Autogenerated from Pigeon (v24.2.0), do not edit directly.
// See also: https://pub.dev/packages/pigeon

package io.flutter.plugins.googlesignin;

import static java.lang.annotation.ElementType.METHOD;
import static java.lang.annotation.RetentionPolicy.CLASS;

import android.util.Log;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import io.flutter.plugin.common.BasicMessageChannel;
import io.flutter.plugin.common.BinaryMessenger;
import io.flutter.plugin.common.MessageCodec;
import io.flutter.plugin.common.StandardMessageCodec;
import java.io.ByteArrayOutputStream;
import java.lang.annotation.Retention;
import java.lang.annotation.Target;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/** Generated class from Pigeon. */
@SuppressWarnings({"unused", "unchecked", "CodeBlock2Expr", "RedundantSuppression", "serial"})
public class Messages {

  /** Error class for passing custom error details to Flutter via a thrown PlatformException. */
  public static class FlutterError extends RuntimeException {

    /** The error code. */
    public final String code;

    /** The error details. Must be a datatype supported by the api codec. */
    public final Object details;

    public FlutterError(@NonNull String code, @Nullable String message, @Nullable Object details) {
      super(message);
      this.code = code;
      this.details = details;
    }
  }

  @NonNull
  protected static ArrayList<Object> wrapError(@NonNull Throwable exception) {
    ArrayList<Object> errorList = new ArrayList<>(3);
    if (exception instanceof FlutterError) {
      FlutterError error = (FlutterError) exception;
      errorList.add(error.code);
      errorList.add(error.getMessage());
      errorList.add(error.details);
    } else {
      errorList.add(exception.toString());
      errorList.add(exception.getClass().getSimpleName());
      errorList.add(
          "Cause: " + exception.getCause() + ", Stacktrace: " + Log.getStackTraceString(exception));
    }
    return errorList;
  }

  @Target(METHOD)
  @Retention(CLASS)
  @interface CanIgnoreReturnValue {}

  /** Pigeon version of SignInOption. */
  public enum SignInType {
    /** Default configuration. */
    STANDARD(0),
    /** Recommended configuration for game sign in. */
    GAMES(1);

    final int index;

    SignInType(final int index) {
      this.index = index;
    }
  }

  /**
   * Pigeon version of SignInInitParams.
   *
   * <p>See SignInInitParams for details.
   *
   * <p>Generated class from Pigeon that represents data sent in messages.
   */
  public static final class InitParams {
    private @NonNull List<String> scopes;

    public @NonNull List<String> getScopes() {
      return scopes;
    }

    public void setScopes(@NonNull List<String> setterArg) {
      if (setterArg == null) {
        throw new IllegalStateException("Nonnull field \"scopes\" is null.");
      }
      this.scopes = setterArg;
    }

    private @NonNull SignInType signInType;

    public @NonNull SignInType getSignInType() {
      return signInType;
    }

    public void setSignInType(@NonNull SignInType setterArg) {
      if (setterArg == null) {
        throw new IllegalStateException("Nonnull field \"signInType\" is null.");
      }
      this.signInType = setterArg;
    }

    private @Nullable String hostedDomain;

    public @Nullable String getHostedDomain() {
      return hostedDomain;
    }

    public void setHostedDomain(@Nullable String setterArg) {
      this.hostedDomain = setterArg;
    }

    private @Nullable String clientId;

    public @Nullable String getClientId() {
      return clientId;
    }

    public void setClientId(@Nullable String setterArg) {
      this.clientId = setterArg;
    }

    private @Nullable String serverClientId;

    public @Nullable String getServerClientId() {
      return serverClientId;
    }

    public void setServerClientId(@Nullable String setterArg) {
      this.serverClientId = setterArg;
    }

    private @NonNull Boolean forceCodeForRefreshToken;

    public @NonNull Boolean getForceCodeForRefreshToken() {
      return forceCodeForRefreshToken;
    }

    public void setForceCodeForRefreshToken(@NonNull Boolean setterArg) {
      if (setterArg == null) {
        throw new IllegalStateException("Nonnull field \"forceCodeForRefreshToken\" is null.");
      }
      this.forceCodeForRefreshToken = setterArg;
    }

    private @Nullable String forceAccountName;

    public @Nullable String getForceAccountName() {
      return forceAccountName;
    }

    public void setForceAccountName(@Nullable String setterArg) {
      this.forceAccountName = setterArg;
    }

    /** Constructor is non-public to enforce null safety; use Builder. */
    InitParams() {}

    @Override
    public boolean equals(Object o) {
      if (this == o) {
        return true;
      }
      if (o == null || getClass() != o.getClass()) {
        return false;
      }
      InitParams that = (InitParams) o;
      return scopes.equals(that.scopes)
          && signInType.equals(that.signInType)
          && Objects.equals(hostedDomain, that.hostedDomain)
          && Objects.equals(clientId, that.clientId)
          && Objects.equals(serverClientId, that.serverClientId)
          && forceCodeForRefreshToken.equals(that.forceCodeForRefreshToken)
          && Objects.equals(forceAccountName, that.forceAccountName);
    }

    @Override
    public int hashCode() {
      return Objects.hash(
          scopes,
          signInType,
          hostedDomain,
          clientId,
          serverClientId,
          forceCodeForRefreshToken,
          forceAccountName);
    }

    public static final class Builder {

      private @Nullable List<String> scopes;

      @CanIgnoreReturnValue
      public @NonNull Builder setScopes(@NonNull List<String> setterArg) {
        this.scopes = setterArg;
        return this;
      }

      private @Nullable SignInType signInType;

      @CanIgnoreReturnValue
      public @NonNull Builder setSignInType(@NonNull SignInType setterArg) {
        this.signInType = setterArg;
        return this;
      }

      private @Nullable String hostedDomain;

      @CanIgnoreReturnValue
      public @NonNull Builder setHostedDomain(@Nullable String setterArg) {
        this.hostedDomain = setterArg;
        return this;
      }

      private @Nullable String clientId;

      @CanIgnoreReturnValue
      public @NonNull Builder setClientId(@Nullable String setterArg) {
        this.clientId = setterArg;
        return this;
      }

      private @Nullable String serverClientId;

      @CanIgnoreReturnValue
      public @NonNull Builder setServerClientId(@Nullable String setterArg) {
        this.serverClientId = setterArg;
        return this;
      }

      private @Nullable Boolean forceCodeForRefreshToken;

      @CanIgnoreReturnValue
      public @NonNull Builder setForceCodeForRefreshToken(@NonNull Boolean setterArg) {
        this.forceCodeForRefreshToken = setterArg;
        return this;
      }

      private @Nullable String forceAccountName;

      @CanIgnoreReturnValue
      public @NonNull Builder setForceAccountName(@Nullable String setterArg) {
        this.forceAccountName = setterArg;
        return this;
      }

      public @NonNull InitParams build() {
        InitParams pigeonReturn = new InitParams();
        pigeonReturn.setScopes(scopes);
        pigeonReturn.setSignInType(signInType);
        pigeonReturn.setHostedDomain(hostedDomain);
        pigeonReturn.setClientId(clientId);
        pigeonReturn.setServerClientId(serverClientId);
        pigeonReturn.setForceCodeForRefreshToken(forceCodeForRefreshToken);
        pigeonReturn.setForceAccountName(forceAccountName);
        return pigeonReturn;
      }
    }

    @NonNull
    ArrayList<Object> toList() {
      ArrayList<Object> toListResult = new ArrayList<>(7);
      toListResult.add(scopes);
      toListResult.add(signInType);
      toListResult.add(hostedDomain);
      toListResult.add(clientId);
      toListResult.add(serverClientId);
      toListResult.add(forceCodeForRefreshToken);
      toListResult.add(forceAccountName);
      return toListResult;
    }

    static @NonNull InitParams fromList(@NonNull ArrayList<Object> pigeonVar_list) {
      InitParams pigeonResult = new InitParams();
      Object scopes = pigeonVar_list.get(0);
      pigeonResult.setScopes((List<String>) scopes);
      Object signInType = pigeonVar_list.get(1);
      pigeonResult.setSignInType((SignInType) signInType);
      Object hostedDomain = pigeonVar_list.get(2);
      pigeonResult.setHostedDomain((String) hostedDomain);
      Object clientId = pigeonVar_list.get(3);
      pigeonResult.setClientId((String) clientId);
      Object serverClientId = pigeonVar_list.get(4);
      pigeonResult.setServerClientId((String) serverClientId);
      Object forceCodeForRefreshToken = pigeonVar_list.get(5);
      pigeonResult.setForceCodeForRefreshToken((Boolean) forceCodeForRefreshToken);
      Object forceAccountName = pigeonVar_list.get(6);
      pigeonResult.setForceAccountName((String) forceAccountName);
      return pigeonResult;
    }
  }

  /**
   * Pigeon version of GoogleSignInUserData.
   *
   * <p>See GoogleSignInUserData for details.
   *
   * <p>Generated class from Pigeon that represents data sent in messages.
   */
  public static final class UserData {
    private @Nullable String displayName;

    public @Nullable String getDisplayName() {
      return displayName;
    }

    public void setDisplayName(@Nullable String setterArg) {
      this.displayName = setterArg;
    }

    private @NonNull String email;

    public @NonNull String getEmail() {
      return email;
    }

    public void setEmail(@NonNull String setterArg) {
      if (setterArg == null) {
        throw new IllegalStateException("Nonnull field \"email\" is null.");
      }
      this.email = setterArg;
    }

    private @NonNull String id;

    public @NonNull String getId() {
      return id;
    }

    public void setId(@NonNull String setterArg) {
      if (setterArg == null) {
        throw new IllegalStateException("Nonnull field \"id\" is null.");
      }
      this.id = setterArg;
    }

    private @Nullable String photoUrl;

    public @Nullable String getPhotoUrl() {
      return photoUrl;
    }

    public void setPhotoUrl(@Nullable String setterArg) {
      this.photoUrl = setterArg;
    }

    private @Nullable String idToken;

    public @Nullable String getIdToken() {
      return idToken;
    }

    public void setIdToken(@Nullable String setterArg) {
      this.idToken = setterArg;
    }

    private @Nullable String serverAuthCode;

    public @Nullable String getServerAuthCode() {
      return serverAuthCode;
    }

    public void setServerAuthCode(@Nullable String setterArg) {
      this.serverAuthCode = setterArg;
    }

    /** Constructor is non-public to enforce null safety; use Builder. */
    UserData() {}

    @Override
    public boolean equals(Object o) {
      if (this == o) {
        return true;
      }
      if (o == null || getClass() != o.getClass()) {
        return false;
      }
      UserData that = (UserData) o;
      return Objects.equals(displayName, that.displayName)
          && email.equals(that.email)
          && id.equals(that.id)
          && Objects.equals(photoUrl, that.photoUrl)
          && Objects.equals(idToken, that.idToken)
          && Objects.equals(serverAuthCode, that.serverAuthCode);
    }

    @Override
    public int hashCode() {
      return Objects.hash(displayName, email, id, photoUrl, idToken, serverAuthCode);
    }

    public static final class Builder {

      private @Nullable String displayName;

      @CanIgnoreReturnValue
      public @NonNull Builder setDisplayName(@Nullable String setterArg) {
        this.displayName = setterArg;
        return this;
      }

      private @Nullable String email;

      @CanIgnoreReturnValue
      public @NonNull Builder setEmail(@NonNull String setterArg) {
        this.email = setterArg;
        return this;
      }

      private @Nullable String id;

      @CanIgnoreReturnValue
      public @NonNull Builder setId(@NonNull String setterArg) {
        this.id = setterArg;
        return this;
      }

      private @Nullable String photoUrl;

      @CanIgnoreReturnValue
      public @NonNull Builder setPhotoUrl(@Nullable String setterArg) {
        this.photoUrl = setterArg;
        return this;
      }

      private @Nullable String idToken;

      @CanIgnoreReturnValue
      public @NonNull Builder setIdToken(@Nullable String setterArg) {
        this.idToken = setterArg;
        return this;
      }

      private @Nullable String serverAuthCode;

      @CanIgnoreReturnValue
      public @NonNull Builder setServerAuthCode(@Nullable String setterArg) {
        this.serverAuthCode = setterArg;
        return this;
      }

      public @NonNull UserData build() {
        UserData pigeonReturn = new UserData();
        pigeonReturn.setDisplayName(displayName);
        pigeonReturn.setEmail(email);
        pigeonReturn.setId(id);
        pigeonReturn.setPhotoUrl(photoUrl);
        pigeonReturn.setIdToken(idToken);
        pigeonReturn.setServerAuthCode(serverAuthCode);
        return pigeonReturn;
      }
    }

    @NonNull
    ArrayList<Object> toList() {
      ArrayList<Object> toListResult = new ArrayList<>(6);
      toListResult.add(displayName);
      toListResult.add(email);
      toListResult.add(id);
      toListResult.add(photoUrl);
      toListResult.add(idToken);
      toListResult.add(serverAuthCode);
      return toListResult;
    }

    static @NonNull UserData fromList(@NonNull ArrayList<Object> pigeonVar_list) {
      UserData pigeonResult = new UserData();
      Object displayName = pigeonVar_list.get(0);
      pigeonResult.setDisplayName((String) displayName);
      Object email = pigeonVar_list.get(1);
      pigeonResult.setEmail((String) email);
      Object id = pigeonVar_list.get(2);
      pigeonResult.setId((String) id);
      Object photoUrl = pigeonVar_list.get(3);
      pigeonResult.setPhotoUrl((String) photoUrl);
      Object idToken = pigeonVar_list.get(4);
      pigeonResult.setIdToken((String) idToken);
      Object serverAuthCode = pigeonVar_list.get(5);
      pigeonResult.setServerAuthCode((String) serverAuthCode);
      return pigeonResult;
    }
  }

  private static class PigeonCodec extends StandardMessageCodec {
    public static final PigeonCodec INSTANCE = new PigeonCodec();

    private PigeonCodec() {}

    @Override
    protected Object readValueOfType(byte type, @NonNull ByteBuffer buffer) {
      switch (type) {
        case (byte) 129:
          {
            Object value = readValue(buffer);
            return value == null ? null : SignInType.values()[((Long) value).intValue()];
          }
        case (byte) 130:
          return InitParams.fromList((ArrayList<Object>) readValue(buffer));
        case (byte) 131:
          return UserData.fromList((ArrayList<Object>) readValue(buffer));
        default:
          return super.readValueOfType(type, buffer);
      }
    }

    @Override
    protected void writeValue(@NonNull ByteArrayOutputStream stream, Object value) {
      if (value instanceof SignInType) {
        stream.write(129);
        writeValue(stream, value == null ? null : ((SignInType) value).index);
      } else if (value instanceof InitParams) {
        stream.write(130);
        writeValue(stream, ((InitParams) value).toList());
      } else if (value instanceof UserData) {
        stream.write(131);
        writeValue(stream, ((UserData) value).toList());
      } else {
        super.writeValue(stream, value);
      }
    }
  }

  /** Asynchronous error handling return type for non-nullable API method returns. */
  public interface Result<T> {
    /** Success case callback method for handling returns. */
    void success(@NonNull T result);

    /** Failure case callback method for handling errors. */
    void error(@NonNull Throwable error);
  }

  /** Asynchronous error handling return type for nullable API method returns. */
  public interface NullableResult<T> {
    /** Success case callback method for handling returns. */
    void success(@Nullable T result);

    /** Failure case callback method for handling errors. */
    void error(@NonNull Throwable error);
  }

  /** Asynchronous error handling return type for void API method returns. */
  public interface VoidResult {
    /** Success case callback method for handling returns. */
    void success();

    /** Failure case callback method for handling errors. */
    void error(@NonNull Throwable error);
  }

  /** Generated interface from Pigeon that represents a handler of messages from Flutter. */
  public interface GoogleSignInApi {
    /** Initializes a sign in request with the given parameters. */
    void init(@NonNull InitParams params);

    /** Starts a silent sign in. */
    void signInSilently(@NonNull Result<UserData> result);

    /** Starts a sign in with user interaction. */
    void signIn(@NonNull Result<UserData> result);

    /** Requests the access token for the current sign in. */
    void getAccessToken(
        @NonNull String email, @NonNull Boolean shouldRecoverAuth, @NonNull Result<String> result);

    /** Signs out the current user. */
    void signOut(@NonNull VoidResult result);

    /** Revokes scope grants to the application. */
    void disconnect(@NonNull VoidResult result);

    /** Returns whether the user is currently signed in. */
    @NonNull
    Boolean isSignedIn();

    /** Clears the authentication caching for the given token, requiring a new sign in. */
    void clearAuthCache(@NonNull String token);
    
    /** Requests access to the given scopes. */
    void requestScopes(@NonNull List<String> scopes, @NonNull Result<Boolean> result);

    /** The codec used by GoogleSignInApi. */
    static @NonNull MessageCodec<Object> getCodec() {
      return PigeonCodec.INSTANCE;
    }

    /**
     * Sets up an instance of `GoogleSignInApi` to handle messages through the `binaryMessenger`.
     */
    static void setUp(@NonNull BinaryMessenger binaryMessenger, @Nullable GoogleSignInApi api) {
      setUp(binaryMessenger, "", api);
    }

    static void setUp(
        @NonNull BinaryMessenger binaryMessenger,
        @NonNull String messageChannelSuffix,
        @Nullable GoogleSignInApi api) {
      messageChannelSuffix = messageChannelSuffix.isEmpty() ? "" : "." + messageChannelSuffix;
      BinaryMessenger.TaskQueue taskQueue = binaryMessenger.makeBackgroundTaskQueue();
      {
        BasicMessageChannel<Object> channel =
            new BasicMessageChannel<>(
                binaryMessenger,
                "dev.flutter.pigeon.google_sign_in_android.GoogleSignInApi.init"
                    + messageChannelSuffix,
                getCodec());
        if (api != null) {
          channel.setMessageHandler(
              (message, reply) -> {
                ArrayList<Object> wrapped = new ArrayList<>();
                ArrayList<Object> args = (ArrayList<Object>) message;
                InitParams paramsArg = (InitParams) args.get(0);
                try {
                  api.init(paramsArg);
                  wrapped.add(0, null);
                } catch (Throwable exception) {
                  wrapped = wrapError(exception);
                }
                reply.reply(wrapped);
              });
        } else {
          channel.setMessageHandler(null);
        }
      }
      {
        BasicMessageChannel<Object> channel =
            new BasicMessageChannel<>(
                binaryMessenger,
                "dev.flutter.pigeon.google_sign_in_android.GoogleSignInApi.signInSilently"
                    + messageChannelSuffix,
                getCodec());
        if (api != null) {
          channel.setMessageHandler(
              (message, reply) -> {
                ArrayList<Object> wrapped = new ArrayList<>();
                Result<UserData> resultCallback =
                    new Result<UserData>() {
                      public void success(UserData result) {
                        wrapped.add(0, result);
                        reply.reply(wrapped);
                      }

                      public void error(Throwable error) {
                        ArrayList<Object> wrappedError = wrapError(error);
                        reply.reply(wrappedError);
                      }
                    };

                api.signInSilently(resultCallback);
              });
        } else {
          channel.setMessageHandler(null);
        }
      }
      {
        BasicMessageChannel<Object> channel =
            new BasicMessageChannel<>(
                binaryMessenger,
                "dev.flutter.pigeon.google_sign_in_android.GoogleSignInApi.signIn"
                    + messageChannelSuffix,
                getCodec());
        if (api != null) {
          channel.setMessageHandler(
              (message, reply) -> {
                ArrayList<Object> wrapped = new ArrayList<>();
                Result<UserData> resultCallback =
                    new Result<UserData>() {
                      public void success(UserData result) {
                        wrapped.add(0, result);
                        reply.reply(wrapped);
                      }

                      public void error(Throwable error) {
                        ArrayList<Object> wrappedError = wrapError(error);
                        reply.reply(wrappedError);
                      }
                    };

                api.signIn(resultCallback);
              });
        } else {
          channel.setMessageHandler(null);
        }
      }
      {
        BasicMessageChannel<Object> channel =
            new BasicMessageChannel<>(
                binaryMessenger,
                "dev.flutter.pigeon.google_sign_in_android.GoogleSignInApi.getAccessToken"
                    + messageChannelSuffix,
                getCodec(),
                taskQueue);
        if (api != null) {
          channel.setMessageHandler(
              (message, reply) -> {
                ArrayList<Object> wrapped = new ArrayList<>();
                ArrayList<Object> args = (ArrayList<Object>) message;
                String emailArg = (String) args.get(0);
                Boolean shouldRecoverAuthArg = (Boolean) args.get(1);
                Result<String> resultCallback =
                    new Result<String>() {
                      public void success(String result) {
                        wrapped.add(0, result);
                        reply.reply(wrapped);
                      }

                      public void error(Throwable error) {
                        ArrayList<Object> wrappedError = wrapError(error);
                        reply.reply(wrappedError);
                      }
                    };

                api.getAccessToken(emailArg, shouldRecoverAuthArg, resultCallback);
              });
        } else {
          channel.setMessageHandler(null);
        }
      }
      {
        BasicMessageChannel<Object> channel =
            new BasicMessageChannel<>(
                binaryMessenger,
                "dev.flutter.pigeon.google_sign_in_android.GoogleSignInApi.signOut"
                    + messageChannelSuffix,
                getCodec());
        if (api != null) {
          channel.setMessageHandler(
              (message, reply) -> {
                ArrayList<Object> wrapped = new ArrayList<>();
                VoidResult resultCallback =
                    new VoidResult() {
                      public void success() {
                        wrapped.add(0, null);
                        reply.reply(wrapped);
                      }

                      public void error(Throwable error) {
                        ArrayList<Object> wrappedError = wrapError(error);
                        reply.reply(wrappedError);
                      }
                    };

                api.signOut(resultCallback);
              });
        } else {
          channel.setMessageHandler(null);
        }
      }
      {
        BasicMessageChannel<Object> channel =
            new BasicMessageChannel<>(
                binaryMessenger,
                "dev.flutter.pigeon.google_sign_in_android.GoogleSignInApi.disconnect"
                    + messageChannelSuffix,
                getCodec());
        if (api != null) {
          channel.setMessageHandler(
              (message, reply) -> {
                ArrayList<Object> wrapped = new ArrayList<>();
                VoidResult resultCallback =
                    new VoidResult() {
                      public void success() {
                        wrapped.add(0, null);
                        reply.reply(wrapped);
                      }

                      public void error(Throwable error) {
                        ArrayList<Object> wrappedError = wrapError(error);
                        reply.reply(wrappedError);
                      }
                    };

                api.disconnect(resultCallback);
              });
        } else {
          channel.setMessageHandler(null);
        }
      }
      {
        BasicMessageChannel<Object> channel =
            new BasicMessageChannel<>(
                binaryMessenger,
                "dev.flutter.pigeon.google_sign_in_android.GoogleSignInApi.isSignedIn"
                    + messageChannelSuffix,
                getCodec());
        if (api != null) {
          channel.setMessageHandler(
              (message, reply) -> {
                ArrayList<Object> wrapped = new ArrayList<>();
                try {
                  Boolean output = api.isSignedIn();
                  wrapped.add(0, output);
                } catch (Throwable exception) {
                  wrapped = wrapError(exception);
                }
                reply.reply(wrapped);
              });
        } else {
          channel.setMessageHandler(null);
        }
      }
      {
        BasicMessageChannel<Object> channel =
            new BasicMessageChannel<>(
                binaryMessenger,
                "dev.flutter.pigeon.google_sign_in_android.GoogleSignInApi.clearAuthCache"
                    + messageChannelSuffix,
                getCodec(),
                taskQueue);
        if (api != null) {
          channel.setMessageHandler(
              (message, reply) -> {
                ArrayList<Object> wrapped = new ArrayList<>();
                ArrayList<Object> args = (ArrayList<Object>) message;
                String tokenArg = (String) args.get(0);
                try {
                  api.clearAuthCache(tokenArg);
                  wrapped.add(0, null);
                } catch (Throwable exception) {
                  wrapped = wrapError(exception);
                }
                reply.reply(wrapped);
              });
        } else {
          channel.setMessageHandler(null);
        }
      }
      {
        BasicMessageChannel<Object> channel =
            new BasicMessageChannel<>(
                binaryMessenger,
                "dev.flutter.pigeon.google_sign_in_android.GoogleSignInApi.requestScopes"
                    + messageChannelSuffix,
                getCodec());
        if (api != null) {
          channel.setMessageHandler(
              (message, reply) -> {
                ArrayList<Object> wrapped = new ArrayList<>();
                ArrayList<Object> args = (ArrayList<Object>) message;
                List<String> scopesArg = (List<String>) args.get(0);
                Result<Boolean> resultCallback =
                    new Result<Boolean>() {
                      public void success(Boolean result) {
                        wrapped.add(0, result);
                        reply.reply(wrapped);
                      }

                      public void error(Throwable error) {
                        ArrayList<Object> wrappedError = wrapError(error);
                        reply.reply(wrappedError);
                      }
                    };

                api.requestScopes(scopesArg, resultCallback);
              });
        } else {
          channel.setMessageHandler(null);
        }
      }
    }
  }
}
