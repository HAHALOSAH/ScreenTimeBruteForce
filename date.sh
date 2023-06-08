#!/bin/bash

while true; do
    # Get the current date and time
    current_date=$(date +%m%d%H%M%Y.%S)

    # Add one day to the current date
    new_date=$(date -j -f "%m%d%H%M%Y.%S" -v+1d "$current_date" +%m%d%H%M%Y.%S)

    # Set the new date and time
    date "$new_date"
    break
done
