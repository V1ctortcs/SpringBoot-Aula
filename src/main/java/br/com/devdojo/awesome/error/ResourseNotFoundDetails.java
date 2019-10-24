package br.com.devdojo.awesome.error;

public class ResourseNotFoundDetails extends ErrorDetail {

    public static final class Builder {
        private  String title;
        private  int status;
        private  String details;
        private  long timestamp;
        private  String developerMessage;

        private Builder() {
        }

        public static Builder newBuilder() {
            return new Builder();
        }

        public Builder title(String title) {
            this.title = title;
            return this;
        }

        public Builder status(int status) {
            this.status = status;
            return this;
        }

        public Builder details(String details) {
            this.details = details;
            return this;
        }

        public Builder timestamp(long timestamp) {
            this.timestamp = timestamp;
            return this;
        }

        public Builder developerMessage(String developerMessage) {
            this.developerMessage = developerMessage;
            return this;
        }

        public ResourseNotFoundDetails build() {
            ResourseNotFoundDetails resourseNotFoundDetails = new ResourseNotFoundDetails();
            resourseNotFoundDetails.setDeveloperMessage(developerMessage);
            resourseNotFoundDetails.setTitle(title);
            resourseNotFoundDetails.setDetails(details);
            resourseNotFoundDetails.setTimestamp(timestamp);
            resourseNotFoundDetails.setStatus(status);
            return resourseNotFoundDetails;
        }
    }
}
